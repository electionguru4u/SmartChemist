package oasis.com.smartchemist.databases;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import oasis.com.smartchemist.utils.DetailPO;
import oasis.com.smartchemist.utils.MasterPO;


public class DatabasePurchaseOrder extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "master_purchase";
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_MASTER_PURCHASE_ORDER = "purchase_order";
    private static final String KEY_ID = "_ID";
    private static final String PO_CODE = "po_code";
    private static final String WHOLESALER_PO_CODE = "wholesaler_po_code";
    private static final String EMPLOYEE_CODE = "employee_code";
    private static final String RETAILER_CODE = "retailer_code";
    private static final String DATE = "date";
    private static final String TIME = "time";
    private static final String NO_OF_ITEMS = "no_of_items";
    private static final String TOTAL_AMOUNT = "total_amount";
    private static final String TOTAL_DISCOUNT = "total_discount";
    private static final String TOTAL_TAX = "total_tax";
    private static final String TOTAL_BILL = "total_bill";

    private static final String DATABASE_DETAIL_PURCHASE_ORDER = "detail_purchase_order";
    private static final String PRODUCT_CODE = "product_code";
    private static final String PRODUCT_QUANTITY = "product_quantity";
    private static final String RATE = "rate";
    private static final String FREE_QUANTITY = "free_quantity";
    private static final String PRODUCT_AMOUNT = "product_amount";
    private static final String PRODUCT_DISCOUNT = "product_discount";
    private static final String PRODUCT_TOTAL_TAX = "product_total_tax";
    private static final String PRODUCT_TOTAL_AMOUNT = "product_total_amount";

    public DatabasePurchaseOrder(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String create_table_purchase_order = "CREATE TABLE " + DATABASE_MASTER_PURCHASE_ORDER + "(" + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + PO_CODE + " TEXT," + WHOLESALER_PO_CODE + " TEXT," + EMPLOYEE_CODE + " TEXT," + RETAILER_CODE + " TEXT," + DATE + " TEXT," + TIME + " TEXT," + NO_OF_ITEMS + " TEXT," + TOTAL_AMOUNT + " TEXT," + TOTAL_DISCOUNT + " TEXT," + TOTAL_TAX + " TEXT," + TOTAL_BILL + " TEXT)";
        String create_table_detail_po = "CREATE TABLE " + DATABASE_DETAIL_PURCHASE_ORDER + "(" + PO_CODE + " TEXT," + WHOLESALER_PO_CODE + " TEXT," + PRODUCT_CODE + " TEXT," + PRODUCT_QUANTITY + " TEXT," + RATE + " TEXT," + FREE_QUANTITY + " TEXT," + PRODUCT_AMOUNT + " TEXT," + PRODUCT_DISCOUNT + " TEXT," + PRODUCT_TOTAL_TAX + " TEXT," + PRODUCT_TOTAL_AMOUNT + " TEXT)";
        sqLiteDatabase.execSQL(create_table_purchase_order);
        sqLiteDatabase.execSQL(create_table_detail_po);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String drop_table_purchase_order = "DROP TABLE IF EXISTS " + DATABASE_MASTER_PURCHASE_ORDER;
        String drop_table_detail_po = "DROP TABLE IF EXISTS " + DATABASE_DETAIL_PURCHASE_ORDER;
        sqLiteDatabase.execSQL(drop_table_purchase_order);
        sqLiteDatabase.execSQL(drop_table_detail_po);
    }

    public void insertMasterPO(MasterPO masterPO){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(PO_CODE,masterPO.getPo_code());
        values.put(WHOLESALER_PO_CODE,masterPO.getWholesaler_po_code());
        values.put(EMPLOYEE_CODE,masterPO.getEmployee_code());
        values.put(RETAILER_CODE,masterPO.getRetailer_code());
        values.put(DATE,masterPO.getDate());
        values.put(TIME,masterPO.getTime());
        values.put(NO_OF_ITEMS,masterPO.getNo_of_items());
        values.put(TOTAL_AMOUNT,masterPO.getTotal_amount());
        values.put(TOTAL_DISCOUNT,masterPO.getTotal_discount());
        values.put(TOTAL_TAX,masterPO.getTotal_tax());
        values.put(TOTAL_BILL,masterPO.getTotal_bill());
        db.insert(DATABASE_MASTER_PURCHASE_ORDER,null,values);
        db.close();
    }

    public void insertDetailPO(DetailPO detailPO){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(PO_CODE,detailPO.getPo_code());
        values.put(WHOLESALER_PO_CODE,detailPO.getWholesaler_po_code());
        values.put(PRODUCT_CODE,detailPO.getWholesaler_po_code());
        values.put(PRODUCT_QUANTITY,detailPO.getWholesaler_po_code());
        values.put(RATE,detailPO.getWholesaler_po_code());
        values.put(FREE_QUANTITY,detailPO.getWholesaler_po_code());
        values.put(PRODUCT_AMOUNT,detailPO.getWholesaler_po_code());
        values.put(PRODUCT_DISCOUNT,detailPO.getWholesaler_po_code());
        values.put(PRODUCT_TOTAL_TAX,detailPO.getWholesaler_po_code());
        values.put(PRODUCT_TOTAL_AMOUNT,detailPO.getWholesaler_po_code());
        db.insert(DATABASE_DETAIL_PURCHASE_ORDER,null,values);
        db.close();
    }
}
