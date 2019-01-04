/**
 * com.lutzwolf.tyche.manager.templates.DepositPage
 *
 * 	© 2009-2012 by LUTZWOLF Systems GmbH
 * 	http://www.lutzwolf.de
 * 
 * Modification history
 * -------------------------------------------------------------------------
 * 29.02.2012 corrected some Message constants
 * 29.09.2011 added support for coin dispense on overpayment
 * 24.06.2011 Added "Dispensed from recycler" to screen 3 of a deposit transaction
 * 03.06.2010 set notes from online to read only
 * 23.11.2009 renamed dispenser to device
 * 18.09.2009 moved Messages to package common
 * 09.07.2009 renamed amount_to_deposit to amount
 * 24.06.2009 renamed internationalization names to DepositPage...
 * 23.06.2009 use getDecimalProperty
 * 18.06.2009 created
 */

package com.lutzwolf.tyche.manager.templates;

import com.lutzwolf.tyche.common.TableData;
import com.lutzwolf.tyche.manager.remote.Constants;

import java.io.Serializable;
import java.util.Locale;

import org.antlr.stringtemplate.StringTemplate;


/**
 * Represents the screens for a deposit transaction.
 */
public class DepositPage
    extends BaseTransactionPage
    implements Serializable
{
    // ---------------------------------------------------------------------
    // Properties
    // ---------------------------------------------------------------------

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = -58868120889435840L;
    private final int         screen;

    // ---------------------------------------------------------------------
    // Construction
    // ---------------------------------------------------------------------

    /**
     * Create a new deposit screen.
     * 
     * @param locale The current locale.
     * @param screen The id of the screen that should be created.
     */
    public DepositPage( final Locale locale,
                        final int screen )
    {
        super( locale );

        this.screen = screen;

    } // end of constructor

    // ---------------------------------------------------------------------
    // Private helper methods
    // ---------------------------------------------------------------------

    /**
     * Create the start screen.
     * 
     * @return The start screen.
     */
    private StringTemplate createStartScreen()
    {
        final StringTemplate result = getTemplates()
                .getInstanceOf("deposit_page_1");

        result.setAttribute( "amount_label",
                             getText( "DepositPage.AMOUNT_LABEL" ) ); //$NON-NLS-1$

        String amountString = getData().getHTML( Constants.FIELD_INITIAL_AMOUNT,
                                                 "" );
        if( amountString.length() == 0 )
        {
            amountString = getData().getDecimalProperty( Constants.FIELD_AMOUNT );
        }
        final TextField amount = new TextField( Constants.FIELD_AMOUNT,
                                                amountString );
        amount.setMaxLength( Constants.NUMBER_OF_TOTAL_DIGITS );
        amount.setGuiClass( "initial_amount" );
        result.setAttribute( "amount",
                             amount );

        final boolean online = getData().getBooleanProperty( Constants.FIELD_ONLINE );
        final TextField note = new TextField( Constants.FIELD_NOTE,
                                              getData().getHTML( Constants.FIELD_NOTE,
                                                                 "" ) );
        note.setReadOnly( online );
        result.setAttribute( "note_label",
                             getText( "DepositPage.TRANSACTION_NOTE_LABEL" ) ); //$NON-NLS-1$
        result.setAttribute( "note",
                             note );

        result.setAttribute( "available_devices_label",
                             getText( "DepositPage.AVAILABLE_DEVICE_LABEL" ) ); //$NON-NLS-1$
        result.setAttribute( "devices",
                             new GuiSelectBox( Constants.BOX_DISPENSER,
                                               getData().getSelectBoxProperty( Constants.BOX_DISPENSER ) ) );

        final GuiSelectBox currencies = new GuiSelectBox( Constants.BOX_CURRENCIES,
                                                          getData().getSelectBoxProperty( Constants.BOX_CURRENCIES ),
                                                          false );

        currencies.setGuiClass( "currency_box" );

        result.setAttribute( "box_currencies",
                             currencies );

        return result;

    } // end of createStartScreen

    // ---------------------------------------------------------------------

    /**
     * Create the deposit screen.
     * 
     * @return The deposit screen.
     */
    private StringTemplate createDepositScreen()
    {
        final StringTemplate result = getTemplates()
                .getInstanceOf("deposit_page_2");

        result.setAttribute( "amount_label",
                             getText( "DepositPage.AMOUNT_LABEL" ) ); //$NON-NLS-1$
        result.setAttribute( "amount",
                             getData().getDecimalProperty( Constants.FIELD_AMOUNT ) );

        final boolean online = getData().getBooleanProperty( Constants.FIELD_ONLINE );
        final TextField note = new TextField( Constants.FIELD_NOTE,
                                              getData().getHTML( Constants.FIELD_NOTE,
                                                                 "" ) );
        note.setReadOnly( online );
        result.setAttribute( "note_label",
                             getText( "DepositPage.TRANSACTION_NOTE_LABEL" ) ); //$NON-NLS-1$
        result.setAttribute( "note",
                             note );

        result.setAttribute( "cashbox_label",
                             getText( "DepositPage.DEPOSITED_MANUALLY_LABEL" ) ); //$NON-NLS-1$
        final TextField tmp = new TextField( Constants.FIELD_MANUAL,
                                             getData().getDecimalProperty( Constants.FIELD_MANUAL ) );
        tmp.setGuiClass( "deposit_cashbox" );
        tmp.setMaxLength( Constants.NUMBER_OF_TOTAL_DIGITS );
        result.setAttribute( "cashbox",
                             tmp );

        result.setAttribute( "total_label",
                             getText( "DepositPage.DEPOSITED_RECYCLER_LABEL" ) ); //$NON-NLS-1$
        result.setAttribute( "total",
                             getData().getDecimalProperty( Constants.FIELD_TOTAL ) );

        result.setAttribute( "grand_total_label",
                             getText( "DepositPage.GRAND_TOTAL_LABEL" ) ); //$NON-NLS-1$
        result.setAttribute( "grand_total",
                             getData().getDecimalProperty( Constants.FIELD_GRAND_TOTAL ) );

        final TableData depositedTable = getData().getTableDataProperty( Constants.TABLE_DEPOSITED );
        result.setAttribute( "deposited_table",
                             depositedTable );

        // Coin related info
        final boolean coinAvailable = getData().getBooleanProperty( Constants.FIELD_COINDISPENSER );
        if( coinAvailable )
        {
            result.setAttribute( "coin_available",
                                 "1" ); //$NON-NLS-1$
            final TableData coinTable = getData().getTableDataProperty( Constants.TABLE_COIN );

            result.setAttribute( "coin_table",
                                 coinTable );

            result.setAttribute( "coin_label",
                                 "Deposited Coin" ); //$NON-NLS-1$

            result.setAttribute( "coin",
                                 getData().getDecimalProperty( Constants.FIELD_COIN ) );
        }

        if( getData().getBooleanProperty( Constants.FLAG_CONTINUOUS_DEPOSIT ) )
        {
            result.setAttribute( "continuous_deposit",
                                 "1" );
        }


        if( getData().getBooleanProperty( Constants.FIELD_DEPOSIT_OK ) )
        {
            result.setAttribute( "deposit_ok",
                                 1 );
        }

        if( getData().getBooleanProperty( Constants.FIELD_DEPOSIT_ORDER ) )
        {
            result.setAttribute( "deposit_order_created",
                                 "1" );
            result.setAttribute( "success_text",
                                 getText( "DepositPage.ORDER_SUCCESS_TEXT" ) );
        }

        return result;

    } // end of createDepositScreen

    // ---------------------------------------------------------------------

    /**
     * Create the confirmation screen.
     * 
     * @return The confirmation screen.
     */
    private StringTemplate createConfirmationScreen()
    {
        final StringTemplate result = getTemplates()
                .getInstanceOf("deposit_page_3");

        result.setAttribute( "amount_label",
                             getText( "DepositPage.AMOUNT_LABEL" ) ); //$NON-NLS-1$
        result.setAttribute( "amount",
                             getData().getDecimalProperty( Constants.FIELD_AMOUNT ) );

        result.setAttribute( "note_label",
                             getText( "DepositPage.TRANSACTION_NOTE_LABEL" ) ); //$NON-NLS-1$

        final String note = getData().getHTML( Constants.FIELD_NOTE );
        result.setAttribute( "note",
                             note );

        final HiddenField noteField = new HiddenField( Constants.FIELD_NOTE,
                                                       note );
        result.setAttribute( "hidden_note",
                             noteField );

        result.setAttribute( "cashbox_deposit_label",
                             getText( "DepositPage.DEPOSITED_MANUALLY_LABEL" ) ); //$NON-NLS-1$
        result.setAttribute( "cashbox_deposit",
                             getData().getDecimalProperty( Constants.FIELD_MANUAL_DEPOSIT ) );

        result.setAttribute( "cashbox_dispense_label",
                             getText( "DepositPage.DISPENSED_MANUALLY_LABEL" ) ); //$NON-NLS-1$
        result.setAttribute( "cashbox_dispense",
                             getData().getDecimalProperty( Constants.FIELD_MANUAL_DISPENSE ) );

        result.setAttribute( "recycler_dispense_label",
                             getText( "DepositPage.DISPENSED_RECYCLER_LABEL" ) );
        result.setAttribute( "recycler_dispense",
                             getData().getDecimalProperty( Constants.FIELD_RECYCLER_DISPENSE ) );

        result.setAttribute( "total_label",
                             getText( "DepositPage.DEPOSITED_RECYCLER_LABEL" ) ); //$NON-NLS-1$
        result.setAttribute( "total",
                             getData().getDecimalProperty( Constants.FIELD_TOTAL ) );

        result.setAttribute( "grand_total_label",
                             getText( "DepositPage.GRAND_TOTAL_LABEL" ) ); //$NON-NLS-1$
        result.setAttribute( "grand_total",
                             getData().getDecimalProperty( Constants.FIELD_GRAND_TOTAL ) );

        final TableData depositedTable = getData().getTableDataProperty( Constants.TABLE_DEPOSITED );
        result.setAttribute( "deposited_table",
                             depositedTable );

        result.setAttribute( "button_amount_label",
                             getText( "DepositPage.BUTTON_AMOUNT_LABEL" ) );

        RadioButton button = new RadioButton( Constants.RADIO_BUTTON_REQUESTED_MIX,
                                              Constants.TYPE_AMOUNT );
        button.setSelected( getData().getBooleanProperty( Constants.RADIO_BUTTON_AMOUNT ) );
        button.setGuiClass( "radiobutton" );
        button.setGuiId( "amount_button" );
        result.setAttribute( "radio_amount",
                             button );

        result.setAttribute( "button_count_label",
                             getText( "DepositPage.BUTTON_COUNT_LABEL" ) ); //$NON-NLS-1$
        button = new RadioButton( Constants.RADIO_BUTTON_REQUESTED_MIX,
                                  Constants.TYPE_COUNT );
        button.setSelected( getData().getBooleanProperty( Constants.RADIO_BUTTON_COUNT ) );
        button.setGuiClass( "radiobutton" );
        result.setAttribute( "radio_count",
                             button );

        final boolean coinAvailable = getData().getBooleanProperty( Constants.FIELD_COINDISPENSER );
        if( coinAvailable )
        {
            result.setAttribute( "coin_available",
                                 "1" ); //$NON-NLS-1$

            final TableData coinTable = getData().getTableDataProperty( Constants.TABLE_COIN );

            result.setAttribute( "coin_table",
                                 coinTable );

            result.setAttribute( "coin_deposit_label",
                                 "Deposited Coin" ); //$NON-NLS-1$

            result.setAttribute( "coin_deposit",
                                 getData().getDecimalProperty( Constants.FIELD_COIN ) );
        }

        // coin recycler or coin dispenser with coin dispense > 0
        if( getData().getBooleanProperty( Constants.FIELD_COIN_AVAILABLE ) )
        {
            result.setAttribute( "show_coin_dispensed",
                                 "1" );
            result.setAttribute( "coin_label",
                                 getText( "DepositPage.COIN_LABEL" ) ); //$NON-NLS-1$
            result.setAttribute( "coin",
                                 getData().getDecimalProperty( Constants.FIELD_COIN_DISPENSED ) );
        }

        return result;

    } // end of createConfirmationScreen

    // ---------------------------------------------------------------------

    /**
     * Create the confirm screen.
     *
     * @return The confirm screen.
     */
    private StringTemplate createConfirmScreen()
    {
        final StringTemplate result = getTemplates().getInstanceOf( "deposit_page_5" );

        result.setAttribute( "error_label",
                             getText( "CorrectionPage.WARNING_LABEL" ) );

        result.setAttribute( "error_text1",
                             getText( "CorrectionPage.ERROR_TEXT_1" ) );

        result.setAttribute( "error_text2",
                             getText( "CorrectionPage.ERROR_TEXT_2" ) );

        result.setAttribute( "error_text3",
                             getText( "CorrectionPage.ERROR_TEXT_3" ) );

        result.setAttribute( "note_label",
                             getText( "DispensePage.TRANSACTION_NOTE_LABEL" ) ); //$NON-NLS-1$

        final TextField note = new TextField( Constants.FIELD_NOTE,
                                              getData().getHTML( Constants.FIELD_NOTE,
                                                                 "" ) );
        note.setMaxLength( 50 );

        result.setAttribute( "note",
                             note );

        result.setAttribute( "button_amount_label",
                             getText( "DispensePage.BUTTON_AMOUNT_LABEL" ) ); //$NON-NLS-1$
        RadioButton button = new RadioButton( Constants.RADIO_BUTTON_REQUESTED_MIX,
                                              Constants.TYPE_AMOUNT );
        button.setSelected( getData().getBooleanProperty( Constants.RADIO_BUTTON_AMOUNT ) );
        button.setGuiClass( "radiobutton" );
        button.setGuiId( "amount_button" );
        result.setAttribute( "radio_amount",
                             button );

        result.setAttribute( "button_count_label",
                             getText( "DispensePage.BUTTON_COUNT_LABEL" ) ); //$NON-NLS-1$
        button = new RadioButton( Constants.RADIO_BUTTON_REQUESTED_MIX,
                                  Constants.TYPE_COUNT );
        button.setSelected( getData().getBooleanProperty( Constants.RADIO_BUTTON_COUNT ) );
        button.setGuiClass( "radiobutton" );
        result.setAttribute( "radio_count",
                             button );

        final TableData mixTable = getData().getTableDataProperty( Constants.TABLE_MIXED );
        result.setAttribute( "data",
                             mixTable );
        return result;

    } // end of createConfirmScreen

    // ---------------------------------------------------------------------
    // Implementation of the base class' abstract methods
    // ---------------------------------------------------------------------

    @Override
    protected String getIcon()
    {
        return "heading_depoit.png";

    } // end of getIcon

    // ---------------------------------------------------------------------

    @Override
    protected String getTitle()
    {
        return getText( "MENU.TRANSACTIONS.DEPOSIT" );

    } // end of getTitle

    // ---------------------------------------------------------------------

    @Override
    protected StringTemplate generateContent()
    {
        StringTemplate result = null;

        switch( screen )
        {
            case 1:
                result = createStartScreen();
                break;
            case 2:
                result = createDepositScreen();
                break;
            case 3:
                result = createConfirmationScreen();
                break;
            case 5:
                result = createConfirmScreen();
                break;
            default:
                result = createStartScreen();

        } // end switch

        return result;

    } // end of generateContent

}
// -------------------------------------------------------------------------
// end of class DepositPage
