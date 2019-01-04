<table class="formtable">

    <colgroup>
        <col width="25%">
        <col width="25%">
        <col width="25%">
        <col width="24%">
    </colgroup>

    $number_2_3_4col()$

    $amount()$

    $blankline()$

    $if(deposited_table)$
    <tr>
        <td colspan="4">
            <table class="datatable" id="notetable">
                <tr>
                    $deposited_table.header:header()$
                </tr> 
                $deposited_table.rows:row()$
            </table>
        </td>
    </tr>
    <tr>
        <td class="rlabel" colspan="3">
            $total_label$
        </td>

        $itotal()$
    </tr>
    $endif$
    
    $if(coin_available)$ 
    <tr>
        <td colspan="4">
            <table class="datatable" id="cointable" style="display:none">
                <tr>
                    $coin_table.header:header()$
                </tr> 
                $coin_table.rows:row()$
            </table>
        </td>
    </tr>
    <tr>
    	<td class="rlabel" colspan="3">
            <a href="javascript:toggle();">$coin_label$</a>
        </td>

        <td class="numeric" id="cointotal">
    		$coin$
		</td>
    </tr>
    $endif$

    <tr>
        <td class="rlabel" colspan="3">
            $cashbox_label$
        </td>

        $icashbox()$
    </tr>

    <tr>
        <td class="rlabel" colspan="3">
            $grand_total_label$
        </td>
        <td id="deposit_total" class="numeric"
            $if(deposit_ok)$
                style="color:black;"
            $else$
                style="color:red;"
            $endif$>

            $grand_total$
        </td>
    </tr>

    <tr>
        <td class="rlabel" colspan="4">
            $note_label$
            $note:display_text_field()$
        </td>
    </tr>

</table>
<script type="text/javascript">
    var cointable_visible=0;

    function toggle(){
    	if( cointable_visible ) {
    		\$( "#cointable" ).hide();
    		cointable_visible=0;
        } else {            	
    		\$( "#cointable" ).show();
    		cointable_visible=1;
        }		
    }
	
	\$.tablesorter.addParser({ 
		// set a unique id 
		id: 'thousands',
		is: function(s) { 
			// return false so this parser is not auto detected 
			return false; 
		}, 
		format: function(s) {
			// format your data for normalization 
			return s.replace('\$','').replace(/,/g,'');
		}, 
		// set type, either numeric or text 
		type: 'numeric' 
	}); 
	\$.tablesorter.addParser({ 
		// set a unique id 
		id: 'input',
		is: function(s) { 
			// return false so this parser is not auto detected 
			return false; 
		}, 
		format: function(s, t, node) {
			// format your data for normalization 
			return node.children[0].value.replace('\$','').replace(/,/g,'');
		}, 
		// set type, either numeric or text 
		type: 'numeric' 
	}); 

	var SO = $field_table_sorted_value$
	\$('table').tablesorter( {sortList: SO}, 
							 {headers: { 2: {sorter:'thousands'}, 3: {sorter:'input'}, 4: {sorter:'thousands'} }}
							 ).bind("sortEnd", function(sorter) {
									
									\$('input[name=field_table_sorted]').val(sorter.target.config.sortList);
							 });
							 
			

	$if(continuous_deposit)$
	
		function event_update( data, textStatus ) {
		
			// Replace the note deposited table
			var notetable = \$("#notetable", data);
			\$("#notetable").replaceWith(notetable); 
			// Replace the note deposited total
			var notetotal = \$("#total", data);
			\$("#total").html(notetotal.html()); 
			
			// Replace the buttons
			var navigation = \$(".navigation", data);
			\$(".navigation").replaceWith(navigation); 
			
			// Replace the coin deposited table
			var cointable = \$("#cointable", data);
			\$("#cointable").replaceWith(cointable); 
			
			//Keep the coin table visibility status
			if( cointable_visible ) {
				\$( "#cointable" ).show();
			} else {            	
				\$( "#cointable" ).hide();
			}
			
			// Replace the note deposited total
			var cointotal = \$("#cointotal", data);
			\$("#cointotal").html(cointotal.html()); 
			
			// Replace the grand total
			var deposit_total = \$("#deposit_total", data);
			\$("#deposit_total").html(deposit_total.html());
			// update the total in case the user has set the cashbox
			calculateDeposit();							
		}
		
		
		function check_Note_events()
		{
		
			\$("#tmp").attr( "name", "action" );
			\$("#tmp").attr( "value", "CHECK_NOTE_EVENTS" );
			
			var fd = \$( document.forms[ 0 ] ).serialize();;
		
			\$.ajax( { 	url: "/cashinsight/assure/do_transaction",
						data: 	fd,
						success: 	function (data, textStatus){
										event_update( data, textStatus );
										// Set the timeout for the next check
										setTimeout(check_Note_events,100);
									},
						error: 		function(jqXHR, textStatus, errorThrown) 
									{
									}
			});
			
			
		
		}
		
		check_Note_events();
		
		$if(coin_available)$

			function check_coin_events()
			{
			
				\$("#tmp").attr( "name", "action" );
				\$("#tmp").attr( "value", "CHECK_COIN_EVENTS" );
				
				var fd = \$( document.forms[ 0 ] ).serialize();;
			
				\$.ajax( { 	url: "/cashinsight/assure/do_transaction",
							data: 	fd,
							success: 	function (data, textStatus){
											event_update( data, textStatus );
											// Set the timeout for the next check
											setTimeout(check_coin_events,100);
										},
							error: 		function(jqXHR, textStatus, errorThrown) 
										{
										}
				});
				
				
			
			}
			
			check_coin_events();
		
		$endif$
		
		// TODO: implement the timeout period as a parameter
		// setTimeout(check_events,3000);
		
		
		
	$endif$

</script>