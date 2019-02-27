package unadeca.net.form.database;
import com.raizlabs.android.dbflow.annotation.Database;

//Version db = 1
@Database(name = TestDatabase.dbname, version = TestDatabase.dbversion)

public class TestDatabase {

    public static final String dbname = "TestDatabase";
    public static final int dbversion = 1;
}
