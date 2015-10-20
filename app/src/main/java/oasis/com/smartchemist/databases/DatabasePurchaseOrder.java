package oasis.com.smartchemist.databases;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabasePurchaseOrder extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "purchase_order";
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_MASTER_PURCHASE_ORDER = "master_purchase_order";
    private static final String KEY_ID = "_ID";
    private static final String PO_CODE = "po_code";
    private static final String MPO_PO_DATE = "po_date";
    private static final String MPO_PO_TIME= "po_time";
    private static final String MPO_WHOLESALER_CODE= "wholesaler_code";
    private static final String MPO_NO_OF_ITEMS= "no_of_items";
    private static final String MPO_TOTAL_AMOUNT_WITHOUT_TAX= "total_amount_without_tax";
    private static final String MPO_DISC_PER= "disc_per";
    private static final String MPO_DISC_AMT= "disc_amt";
    private static final String MPO_TAX= "tax";
    private static final String MPO_CREDIT_NOTE= "credit_note";
    private static final String MPO_GOODS_RETURN_AMOUNT= "goods_return_amount";
    private static final String MPO_EXPIRED_GOODS_AMOUNT= "expired_goods_amount";
    private static final String MPO_CHEQUE_DD_DISCOUNT= "cheque_dd_discount";
    private static final String MPO_CASH_DISCOUNT= "cash_discount";
    private static final String MPO_OTHER_AMOUNT= "other_amount";
    private static final String MPO_TOTAL_AMOUNT_WITH_TAX= "total_amount_with_tax";
    private static final String MPO_ROUNDING_FACTORS= "rounding_factors";
    private static final String MPO_TOTAL_AMOUNT_WITH_ROUNDING_FACTORS= "total_amount_with_rounding_factors";
    private static final String MPO_DUE_DATE= "due_date";
    private static final String MPO_FINANCIAL_YEAR= "financial_year";

    private static final String DATABASE_MASTER_PO_TAX = "master_po_tax";
    //private static final String PO_CODE = "po_code";
    private static final String TAX_CODE= "tax_code";
    private static final String TOTAL_AMOUNT= "total_amount";
    private static final String TAX_AMOUNT= "tax_amount";

    private static final String DATABASE_DETAIL_PURCHASE_ORDER = "detail_purchase_order";
    //private static final String PO_CODE = "po_code";
    private static final String DPO_BATCH_CODE = "batch_code";
    private static final String DPO_QTY = "qty";
    private static final String DPO_FREE_QTY = "free_qty";
    private static final String DPO_RATE = "rate";
//    private static final String MPT_TAX_CODE= "tax_code";
    private static final String DPO_TOTAL_TAX= "total_tax";
    private static final String DPO_TOTAL_AMOUNT_WITH_TAX= "total_amount_with_tax";

    private static final String DATABASE_DETAIL_PO_TAX = "detail_po_tax";
    //po_code,tax_code,total_amount,tax_amount;
    //private static final String PO_CODE = "po_code";
    //private static final String MPT_TAX_CODE= "tax_code";
    //private static final String MPT_TOTAL_AMOUNT= "total_amount";
    //private static final String MPT_TAX_AMOUNT= "tax_amount";

    public DatabasePurchaseOrder(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }

}
