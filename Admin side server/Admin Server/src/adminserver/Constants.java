package adminserver;

/**
 *
 * @author DEGUZMAN
 */
public final class Constants {

    public static final String DONT_EXIST = "dont exist";
    public static final String EXIST = "exist";
    
    public static final String VERIFY_ADMIN_REQUEST = "verify admin";
    public static final String GENERATE_ACCOUNT_REQUEST = "generate account";
    public static final String ADD_CUSTOMER_REQUEST = "add customer";
    public static final String VERIFY_CUSTOMER_REQUEST = "verify customer";
    public static final String CHECK_FINGERPRINT_REQUEST = "check if fingerprint exist";
    public static final String ADD_ACCOUNT_REQUEST = "add account";
    public static final String GET_ID_REQUEST = "get id";
    public static final String GET_ACCOUNTS_REQUEST = "get accounts";
    public static final String GET_ACCOUNT_BALANCES_REQUEST = "get account balances";
    public static final String GET_NAMES_REQUEST = "get names";
    
    public static final String ACTION_SUCCESSFUL = "successful";
    public static final String ACTION_UNSUCCESSFUL = "unsuccessful";

    private Constants() {
        //this prevents even the native class from calling this ctor as well :
        throw new AssertionError();
    }
}
