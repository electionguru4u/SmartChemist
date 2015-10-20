package oasis.com.smartchemist.databases;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import oasis.com.smartchemist.utils.Company;
import oasis.com.smartchemist.utils.DrugSchedule;
import oasis.com.smartchemist.utils.DrugType;
import oasis.com.smartchemist.utils.Product;

public class DatabaseProducts extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "product_details";
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_TABLE_PRODUCTS = "products";
    private static final String PRODUCT_ID = "_id";
    public static final String PRODUCT_CODE = "product_code";
    public static final String PRODUCT_NAME = "product_name";
    public static final String PACKING_TYPE = "packing_type";
    public static final String PRODUCT_CONTENT = "product_content";
    private static final String PRODUCT_DESCRIPTION = "product_description";
    private static final String PRODUCT_RANK = "product_rank";

    private static final String DATABASE_TABLE_DRUG_TYPE = "drug_type";
    private static final String DRUG_TYPE_CODE = "drug_type_code";
    private static final String DRUG_TYPE_NAME = "drug_type_name";
    private static final String DRUG_TYPE_DESCRIPTION = "drug_type_description";

    private static final String DATABASE_TABLE_COMPANY = "company";
    private static final String COMPANY_CODE = "company_code";
    private static final String COMPANY_NAME = "company_name";
    private static final String COMPANY_DESCRIPTION = "company_description";

    private static final String DATABASE_TABLE_DRUG_SCHEDULE = "drug_schedule";
    private static final String DRUG_SCHEDULE_CODE = "drug_schedule_code";
    private static final String DRUG_SCHEDULE_NAME = "drug_schedule_name";
    private static final String DRUG_SCHEDULE_DESCRIPTION = "drug_schedule_description";

    public DatabaseProducts(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String create_table_products = "CREATE TABLE " + DATABASE_TABLE_PRODUCTS + "(" + PRODUCT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + PRODUCT_CODE + " TEXT," + PRODUCT_NAME + " TEXT," + PACKING_TYPE + " TEXT,"+PRODUCT_CONTENT+" TEXT," + COMPANY_CODE + " TEXT," +DRUG_TYPE_CODE+" TEXT,"+DRUG_SCHEDULE_CODE+" TEXT,"+ PRODUCT_DESCRIPTION + " TEXT," + PRODUCT_RANK + " INTEGER)";
        String create_table_drug_type = "CREATE TABLE " + DATABASE_TABLE_DRUG_TYPE + "(" + DRUG_TYPE_CODE + " TEXT PRIMARY KEY," + DRUG_TYPE_NAME + " TEXT," + DRUG_TYPE_DESCRIPTION + " TEXT)";
        String create_table_company = "CREATE TABLE " + DATABASE_TABLE_COMPANY + "(" + COMPANY_CODE + " TEXT PRIMARY KEY," + COMPANY_NAME + " TEXT," + COMPANY_DESCRIPTION + " TEXT)";
        String create_table_drug_schedule = "CREATE TABLE " + DATABASE_TABLE_DRUG_SCHEDULE+ "(" + DRUG_SCHEDULE_CODE+ " TEXT PRIMARY KEY," + DRUG_SCHEDULE_NAME+ " TEXT," + DRUG_SCHEDULE_DESCRIPTION+ " TEXT)";

        sqLiteDatabase.execSQL(create_table_products);
        sqLiteDatabase.execSQL(create_table_drug_type);
        sqLiteDatabase.execSQL(create_table_company);
        sqLiteDatabase.execSQL(create_table_drug_schedule);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String drop_table_products = "DROP TABLE IF EXISTS " + DATABASE_TABLE_PRODUCTS;
        String drop_table_drug_type = "DROP TABLE IF EXISTS " + DATABASE_TABLE_DRUG_TYPE;
        String drop_table_company = "DROP TABLE IF EXISTS " + DATABASE_TABLE_COMPANY;
        String drop_table_drug_schedule= "DROP TABLE IF EXISTS " + DATABASE_TABLE_DRUG_SCHEDULE;
        sqLiteDatabase.execSQL(drop_table_products);
        sqLiteDatabase.execSQL(drop_table_drug_type);
        sqLiteDatabase.execSQL(drop_table_drug_schedule);
        sqLiteDatabase.execSQL(drop_table_company);
    }

    public void insertProductDetails(Product product) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(PRODUCT_CODE, product.getProduct_code());
        values.put(PRODUCT_NAME, product.getProduct_name());
        values.put(PACKING_TYPE, product.getPacking_type());
        values.put(PRODUCT_CONTENT, product.getProduct_content());
        values.put(COMPANY_CODE, product.getProduct_company_code());
        values.put(DRUG_TYPE_CODE, product.getDrug_type_code());
        values.put(DRUG_SCHEDULE_CODE, product.getDrug_schedule_code());
        values.put(PRODUCT_DESCRIPTION, product.getProduct_description());
        values.put(PRODUCT_RANK, product.getProduct_rank());
        int i = db.update(DATABASE_TABLE_PRODUCTS, values, PRODUCT_CODE + "=?", new String[]{product.getProduct_code()});
        if (i == 0)
            db.insert(DATABASE_TABLE_PRODUCTS, null, values);
        db.close();
    }



    public void insertDrugTypeDetails(DrugType drugType) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DRUG_TYPE_CODE, drugType.getDrug_type_code());
        values.put(DRUG_TYPE_NAME, drugType.getDrug_type_name());
        values.put(DRUG_TYPE_DESCRIPTION, drugType.getDrug_type_description());
        int i = db.update(DATABASE_TABLE_DRUG_TYPE, values, DRUG_TYPE_CODE + "=?", new String[]{drugType.getDrug_type_code()});
        if (i == 0)
            db.insert(DATABASE_TABLE_DRUG_TYPE, null, values);
        db.close();
    }

    public void insertDrugScheduleDetails(DrugSchedule drugSchedule) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DRUG_SCHEDULE_CODE,drugSchedule.getDrug_schedule_code());
        values.put(DRUG_SCHEDULE_NAME, drugSchedule.getDrug_schedule_name());
        values.put(DRUG_SCHEDULE_DESCRIPTION, drugSchedule.getDrug_schedule_description());
        int i = db.update(DATABASE_TABLE_DRUG_SCHEDULE, values, DRUG_SCHEDULE_CODE+ "=?", new String[]{drugSchedule.getDrug_schedule_code()});
        if (i == 0)
            db.insert(DATABASE_TABLE_DRUG_SCHEDULE, null, values);
        db.close();
    }

    public void insertCompanyDetails(Company company) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COMPANY_CODE, company.getCompany_code());
        values.put(COMPANY_NAME, company.getCompany_name());
        values.put(COMPANY_DESCRIPTION, company.getCompany_desc());
        int i = db.update(DATABASE_TABLE_COMPANY, values, COMPANY_CODE + "=?", new String[]{company.getCompany_code()});
        if (i == 0)
            db.insert(DATABASE_TABLE_COMPANY, null, values);
        db.close();
    }

    public Cursor searchProduct(String product_name) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query(DATABASE_TABLE_PRODUCTS, new String[]{PRODUCT_ID, PRODUCT_CODE, PRODUCT_NAME,PACKING_TYPE}, PRODUCT_NAME + " LIKE '" + product_name + "%'", null, null, null, PRODUCT_NAME + " ASC");
    }

    public String getProductCode(String product_name) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(DATABASE_TABLE_PRODUCTS, new String[]{PRODUCT_CODE}, PRODUCT_NAME + "=?", new String[]{product_name}, null, null, null);
        if (cursor.getCount() != 0) {
            String code = cursor.getString(cursor.getColumnIndex(PRODUCT_CODE));
            cursor.close();
            return code;
        }
        cursor.close();
        return "-1";
    }

    public String getProductName(String product_code) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(DATABASE_TABLE_PRODUCTS, new String[]{PRODUCT_NAME}, PRODUCT_CODE + "=?", new String[]{product_code}, null, null, null);
        if (cursor.getCount() != 0) {
            cursor.moveToFirst();
            String name = cursor.getString(cursor.getColumnIndex(PRODUCT_NAME));
            cursor.close();
            return name;
        }
        cursor.close();
        return "";
    }
}
