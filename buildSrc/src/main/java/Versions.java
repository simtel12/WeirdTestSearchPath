@SuppressWarnings({"unused", "SpellCheckingInspection"})
public interface Versions {
    String android_billing = "1.1";
    String android_job = "1.2.6";
    String android_plugin = com.fitbit.gradle.BuildConfig.androidGradlePluginVersion;
    String android_svg = "1.3";

    String androidx_ktx = "0.3";
    String androidx_annotations = "1.0.0";

    String anko = "0.10.2";

    String arch_core = "1.1.1";
    String arch_lifecycle = "1.1.1";
    String arch_persist = "1.1.1";
    String arch_room = "1.1.1";
    String arch_paging = "1.0.1";
    String arch_work = "1.0.0-beta01";

    String autovalue_core = "1.4";
    String autovalue_gson = "0.4.6";
    String autovalue_parcel = "0.2.5";

    // FITSHOT is a 9.0.0 snapshot that we froze.  When upgrading to 9.0.0 final, be sure to
    // delete mvn-repo/repository/com/jakewharton/butterknife
    String butterknife = "9.0.0-rc2";

    String composer_plugin = "0.5.2";
    String constraint_layout = "1.1.2";

    String dagger2 = "2.19";
    String detekt_plugin = "1.0.0.RC9.2";
    String dexcount_plugin = "0.8.5";
    String dokka_plugin = "0.9.17";

    String espresso = "3.0.2";

    String fabric_plugin = "1.25.4";
    String facebook = "4.32.0";
    String firebase_core = "16.0.4";
    String firebase_messaging = "17.3.4";
    String fitbit_protocol = "2.2.1";
    String flexbox = "0.2.6";
    String frag_nav = "3.0.0";

    String gms_services_plugin = "4.2.0";
    String goldengate_lib = "0.1.62";
    String goldengate_protobuf = "0.0.26";
    String grant = "1.0";
    String greendao = "3.2.2";
    // because this is different than the generator version
    String greendao_plugin = "3.2.2";

    String gson = "2.8.1";
    String guava_in_unit_tests = "23.0-android";
    //there are multiple instances of guava being used in the project.
    String guava = "27.0-android";

    String hamcrest_junit = "2.0.0.0";
    String hockeyapp_sdk = "5.1.0";

    String jackson = "2.8.1";
    String jacoco = "0.1.3";
    String jacoco_tool = "0.8.3";
    String json_rpc = "1.38";
    String jsr305 = "3.0.2";
    String junit = "4.12";
    String junit5 = "5.3.1";

    String kotlin = com.fitbit.gradle.BuildConfig.kotlinVersion;

    String leak_canary = "1.6.1";
    String lib_phone_number = "7.0.11";
    String logansquare = "1.3.7";
    String lottie = "2.5.6";

    String mixpanel = "4.9.2";
    String mockito = "2.19.1";
    String mockito_kotlin = "1.5.0";
    String moshi = "1.8.0";
    String multidex = "1.0.2";
    String mustache = "1.12";
    String mockk = "1.9.kotlin12";

    String moshi_jsonapi = "3.5.0";

    String okhttp = "3.10.0";
    String okio = "1.13.0";
    String opus = "4c1891c912287149ca53838ed53cfbc0b3d159d9";
    String org_json_tests = "20170516";

    String picasso = "2.5.2";
    String play_services_auth = "15.0.1";
    String play_services_base = "15.0.1";
    String play_services_location = "15.0.1";
    String play_services_maps = "15.0.1";
    String play_services_places = "15.0.1";
    String play_services_safetynet = "15.0.1";
    String protobuf = "3.0.0";

    String retrofit = "2.3.0";
    String retrofit_logansquare = "1.4.1";
    String ribs = "0.9.1";
    String robolectric = "4.1";
    String rxjava2 = "2.2.5";
    String rxandroid = "2.1.0";
    String rxbinding = "2.1.1";
    String rxbroadcast = "2.0.0";

    String slf4j_android = "1.7.21";
    String sortinghat = "0.9.7";
    String spongycastle_core = "1.54.0.0";
    String sqlbrite3 = "3.2.0";
    String sqldelight = "0.7.1";
    String stetho = "1.5.0";
    String subsampling_scale_image_view = "3.10.0";
    String support_library = "28.0.0";
    String support_test = "1.0.2";
    String switchboard_protobuf = "0.4.3";

    String three_ten_abp_android = "1.1.1";
    String three_ten_abp_java = "1.3.8";
    String timber = "4.7.1";

    String fbgatt = "0.0.69";
    String cbor = "0.8";

    String checkstyle = "8.13";

    String truth = "0.42";

    String launch_darkly = "2.5.3";
    String optimizely = "2.1.2";
}
