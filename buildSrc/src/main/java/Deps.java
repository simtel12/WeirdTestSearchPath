@SuppressWarnings({"unused", "SpellCheckingInspection"})
public interface Deps {

    String androidsvg = "com.caverock:androidsvg:" + Versions.android_svg;
    String android_billing = "com.android.billingclient:billing:" + Versions.android_billing;

    String androidx_ktx = "androidx.core:core-ktx:" + Versions.androidx_ktx;

    String anko = "org.jetbrains.anko:anko-sqlite:" + Versions.anko;

    String arch_core_common = "android.arch.core:common:" + Versions.arch_core;
    String arch_core_runtime = "android.arch.core:runtime:" + Versions.arch_core;
    String arch_core_testing = "android.arch.core:core-testing:" + Versions.arch_core;
    String arch_lifecycle_compiler = "android.arch.lifecycle:compiler:" + Versions.arch_lifecycle;
    String arch_lifecycle_extensions = "android.arch.lifecycle:extensions:" + Versions.arch_lifecycle;
    String arch_lifecycle_livedata_core = "android.arch.lifecycle:livedata-core:" + Versions.arch_lifecycle;
    String arch_lifecycle_livedata = "android.arch.lifecycle:livedata:" + Versions.arch_lifecycle;
    String arch_lifecycle_reactivestreams = "android.arch.lifecycle:reactivestreams:" + Versions.arch_lifecycle;
    String arch_lifecycle_runtime = "android.arch.lifecycle:runtime:" + Versions.arch_lifecycle;
    String arch_lifecycle_viewmodel = "android.arch.lifecycle:viewmodel:" + Versions.arch_lifecycle;
    String arch_persistance_db_framework = "android.arch.persistence:db-framework:" + Versions.arch_persist;
    String arch_room_compiler = "android.arch.persistence.room:compiler:" + Versions.arch_room;
    String arch_room_core = "android.arch.persistence.room:runtime:" + Versions.arch_room;
    String arch_room_rxjava = "android.arch.persistence.room:rxjava2:" + Versions.arch_room;
    String arch_room_testing = "android.arch.persistence.room:testing:" + Versions.arch_room;
    String arch_paging = "android.arch.paging:runtime:" + Versions.arch_paging;
    String arch_work = "android.arch.work:work-runtime:" + Versions.arch_work;

    String autovalue_lib = "com.google.auto.value:auto-value:" + Versions.autovalue_core;
    String autovalue_compiler = "com.google.auto.value:auto-value:" + Versions.autovalue_core;
    String autovalue_gson_lib = "com.ryanharter.auto.value:auto-value-gson:" + Versions.autovalue_gson;
    String autovalue_gson_compiler = "com.ryanharter.auto.value:auto-value-gson:" + Versions.autovalue_gson;
    String autovalue_parcel_compiler = "com.ryanharter.auto.value:auto-value-parcel:" + Versions.autovalue_parcel;

    String butterknife_lib = "com.jakewharton:butterknife:" + Versions.butterknife;
    String butterknife_compiler = "com.jakewharton:butterknife-compiler:" + Versions.butterknife;

    String cbor = "co.nstant.in:cbor:" + Versions.cbor;
    String colorpicker = "com.jaredrummler:colorpicker:1.0.1";
    String commonsIo = "commons-io:commons-io:2.6";
    String commonsLang = "org.apache.commons:commons-lang3:3.4";

    String dagger_android_compiler = "com.google.dagger:dagger-android-processor:" + Versions.dagger2;
    String dagger_android_support = "com.google.dagger:dagger-android-support:" + Versions.dagger2;
    String dagger_lib = "com.google.dagger:dagger:" + Versions.dagger2;
    String dagger_compiler = "com.google.dagger:dagger-compiler:" + Versions.dagger2;

    String disklrucache = "com.jakewharton:disklrucache:2.0.2";
    String emojiKeyboard = "com.vanniktech:emoji-twitter:0.5.1";
    String evernoteJobs = "com.evernote:android-job:" + Versions.android_job;

    String fabric_crashlytics = "com.crashlytics.sdk.android:crashlytics:2.9.1@aar";

    String facebook = "com.facebook.android:facebook-android-sdk:" + Versions.facebook;
    String firebase_core = "com.google.firebase:firebase-core:" + Versions.firebase_core;
    String firebase_messaging = "com.google.firebase:firebase-messaging:" + Versions.firebase_messaging;

    String fitbit_protocol_core = "com.fitbit.protocol:protocol-core:" + Versions.fitbit_protocol;
    String fitbit_protocol_encryption = "com.fitbit.protocol:protocol-encryption:" + Versions.fitbit_protocol;

    String flexbox = "com.google.android:flexbox:" + Versions.flexbox;
    String frag_nav = "com.ncapdevi:frag-nav:" + Versions.frag_nav;

    String goldengate_bindings = "com.fitbit.goldengate.bindings:GoldenGateBindings:" + Versions.goldengate_lib;
    String goldengate_connection_manager = "com.fitbit.goldengate.connectionmanager:GoldenGateConnectionManager:" + Versions.goldengate_lib;
    String goldengate_protobuf_protocol = "com.fitbit.goldengate.protobuf:GoldenGateProtocol:" + Versions.goldengate_protobuf;
    String goldengate_remoteapi = "com.fitbit.remoteapi:remoteapi:" + Versions.goldengate_lib;
    String rx_bitgatt = "com.fitbit.bluetooth.fbgatt.rx:RxFitbitGatt:" + Versions.goldengate_lib;

    String grant = "com.anthonycr.grant:permissions:" + Versions.grant;

    String greendao_lib = "org.greenrobot:greendao:" + Versions.greendao;
    String greendao_generator = "org.greenrobot:greendao-generator:" + Versions.greendao;

    String gson_core = "com.google.code.gson:gson:" + Versions.gson;

    // I'm making guava use a 'forTests' name just to make it explicit that we
    // don't want it in the main app (because of size)
    String guava_for_tests = "com.google.guava:guava:" + Versions.guava_in_unit_tests;

    String hockeyapp = "net.hockeyapp.android:HockeySDK:" + Versions.hockeyapp_sdk;
    String icu4j = "com.ibm.icu:icu4j:56.1";

    String jackson_core = "com.fasterxml.jackson.core:jackson-core:" + Versions.jackson;

    String json_assert = "org.skyscreamer:jsonassert:1.5.0";

    String json = "org.json:json:20170516";
    String jsonPath = "com.jayway.jsonpath:json-path:2.2.0";
    String jsonrpc = "com.thetransactioncompany:jsonrpc2-base:" + Versions.json_rpc;

    String junit_core = "junit:junit:" + Versions.junit;
    String junit_hamcrest = "org.hamcrest:hamcrest-junit:" + Versions.hamcrest_junit;
    String junit5_api = "org.junit.jupiter:junit-jupiter-api:" + Versions.junit5;
    String junit5_engine = "org.junit.jupiter:junit-jupiter-engine:" + Versions.junit5;
    String junit5_params = "org.junit.jupiter:junit-jupiter-params:" + Versions.junit5;


    // JSR305 seems to be dead (https://github.com/spotbugs/spotbugs/issues/130)
    // JSR305 also introduces issues that break Java9 modules. (https://github.com/ReactiveX/RxJava/pull/5538)
    // We should try to move away from it.
    String jsr305 = "com.google.code.findbugs:jsr305:" + Versions.jsr305;

    // do not include kotlin-reflect in the main app, it is big
    String kotlin_reflect_for_tests = "org.jetbrains.kotlin:kotlin-reflect:" + Versions.kotlin;
    String kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:" + Versions.kotlin;
    String kotlin_stdlib_jdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:" + Versions.kotlin;
    String kotlin_test = "org.jetbrains.kotlin:kotlin-test:" + Versions.kotlin;
    String kotlin_testJunit = "org.jetbrains.kotlin:kotlin-test-junit:" + Versions.kotlin;

    String leakcanary_noop = "com.squareup.leakcanary:leakcanary-android-no-op:" + Versions.leak_canary;
    String leakcanary_android = "com.squareup.leakcanary:leakcanary-android:" + Versions.leak_canary;
    String lottie = "com.airbnb.android:lottie:" + Versions.lottie;

    String link_controller = "com.fitbit.linkcontroller:linkcontroller:" + Versions.goldengate_lib;

    String libphonenumber = "com.googlecode.libphonenumber:libphonenumber:" + Versions.lib_phone_number;

    String logansquare_core = "com.bluelinelabs:logansquare:" + Versions.logansquare;
    String logansquare_compiler = "com.bluelinelabs:logansquare-compiler:" + Versions.logansquare;

    String mavenAntTasks = "org.apache.maven:maven-ant-tasks:2.1.3";
    String mixpanel = "com.mixpanel.android:mixpanel-android:" + Versions.mixpanel;

    String mockito_core = "org.mockito:mockito-core:" + Versions.mockito;
    String mockito_android = "org.mockito:mockito-android:" + Versions.mockito;
    String mockito_kotlin = "com.nhaarman:mockito-kotlin:" + Versions.mockito_kotlin;

    String mockk = "io.mockk:mockk:" + Versions.mockk;

    String moshi = "com.squareup.moshi:moshi:" + Versions.moshi;
    String moshi_jsonapi = "moe.banana:moshi-jsonapi:" + Versions.moshi_jsonapi;
    String moshi_kotlin_codegen = "com.squareup.moshi:moshi-kotlin-codegen:" + Versions.moshi;

    String mustache = "com.samskivert:jmustache:" + Versions.mustache;

    String okhttp3_core = "com.squareup.okhttp3:okhttp:" + Versions.okhttp;
    String okhttp3_logging_interceptor = "com.squareup.okhttp3:logging-interceptor:" + Versions.okhttp;
    String okhttp3_mockwebserver = "com.squareup.okhttp3:mockwebserver:" + Versions.okhttp;
    String okhttp3_picassoDownloader = "com.jakewharton.picasso:picasso2-okhttp3-downloader:1.0.2";

    String okio = "com.squareup.okio:okio:" + Versions.okio;

    String opus = "com.github.jbfitbit:opuscodec:" + Versions.opus;

    String org_json_for_tests = "org.json:json:" + Versions.org_json_tests;

    String picasso = "com.squareup.picasso:picasso:" + Versions.picasso;

    String play_services_auth = "com.google.android.gms:play-services-auth:" + Versions.play_services_auth;
    String play_services_base = "com.google.android.gms:play-services-base:" + Versions.play_services_base;
    String play_services_location = "com.google.android.gms:play-services-location:" + Versions.play_services_location;
    String play_services_maps = "com.google.android.gms:play-services-maps:" + Versions.play_services_maps;
    String play_services_places = "com.google.android.gms:play-services-places:" + Versions.play_services_places;
    String play_services_safetynet = "com.google.android.gms:play-services-safetynet:" + Versions.play_services_safetynet;

    String protobuf = "com.google.protobuf:protobuf-java:" + Versions.protobuf;
    String protobuf_util = "com.google.protobuf:protobuf-java-util:" + Versions.protobuf;
    String reflections = "org.reflections:reflections:0.9.11";

    String retrofit_core = "com.squareup.retrofit2:retrofit:" + Versions.retrofit;
    String retrofit_rxjava2 = "com.squareup.retrofit2:adapter-rxjava2:" + Versions.retrofit;
    String retrofit_mock = "com.squareup.retrofit2:retrofit-mock:" + Versions.retrofit;
    String retrofit_converter_gson = "com.squareup.retrofit2:converter-gson:" + Versions.retrofit;
    String retrofit_converter_logansquare = "com.github.aurae.retrofit2:converter-logansquare:" + Versions.retrofit_logansquare;
    String retrofit_converter_moshi = "com.squareup.retrofit2:converter-moshi:" + Versions.retrofit;
    String retrofit_converter_moshi_jsonapi = "moe.banana:moshi-jsonapi-retrofit-converter:" + Versions.moshi_jsonapi;
    String retrofit_converter_scalars = "com.squareup.retrofit2:converter-scalars:" + Versions.retrofit;

    String ribs_core = "com.uber.rib:rib-android:" + Versions.ribs;
    String ribs_compiler_test = "com.uber.rib:rib-compiler-test:" + Versions.ribs;
    String ribs_test_utils = "com.uber.rib:rib-test-utils:" + Versions.ribs;

    String robolectric_core = "org.robolectric:robolectric:" + Versions.robolectric;
    String robolectric_multidex = "org.robolectric:shadows-multidex:" + Versions.robolectric;
    String robolectric_supportv4 = "org.robolectric:shadows-supportv4:" + Versions.robolectric;

    String rxjava2_core = "io.reactivex.rxjava2:rxjava:" + Versions.rxjava2;
    String rxjava2_android = "io.reactivex.rxjava2:rxandroid:" + Versions.rxandroid;
    String rxjava2_rxbinding = "com.jakewharton.rxbinding2:rxbinding:" + Versions.rxbinding;

    String rxbroadcast = "com.cantrowitz:rxbroadcast:" + Versions.rxbroadcast;

    String slf4j = "org.slf4j:slf4j-android:" + Versions.slf4j_android;
    String sortinghat = "com.fitbit.android:sortinghat-core:" + Versions.sortinghat;
    String spongycastle = "com.madgag.spongycastle:core:" + Versions.spongycastle_core;

    String sqlbrite3 = "com.squareup.sqlbrite3:sqlbrite:" + Versions.sqlbrite3;

    String stetho_core = "com.facebook.stetho:stetho:" + Versions.stetho;
    String stetho_okhttp = "com.facebook.stetho:stetho-okhttp3:" + Versions.stetho;

    String stickylistview = "com.github.mtotschnig:StickyListHeaders:2.7.1";
    String subsampling_scale_imageview = "com.davemorrissey.labs:subsampling-scale-image-view:" + Versions.subsampling_scale_image_view;

    String support_annotations = "com.android.support:support-annotations:" + Versions.support_library;
    String supportx_annotations = "androidx.annotation:annotation:" + Versions.androidx_annotations;
    String support_appcompat_v7 = "com.android.support:appcompat-v7:" + Versions.support_library;
    String support_cardview_v7 = "com.android.support:cardview-v7:" + Versions.support_library;
    String support_compat = "com.android.support:support-compat:" + Versions.support_library;
    String support_core_ui = "com.android.support:support-core-ui:" + Versions.support_library;
    String support_core_utils = "com.android.support:support-core-utils:" + Versions.support_library;
    String support_constraint = "com.android.support.constraint:constraint-layout:" + Versions.constraint_layout;
    String support_customtabs = "com.android.support:customtabs:" + Versions.support_library;
    String support_design = "com.android.support:design:" + Versions.support_library;
    String support_exifinterface = "com.android.support:exifinterface:" + Versions.support_library;
    String support_fragment = "com.android.support:support-fragment:" + Versions.support_library;
    String support_gridlayout_v7 = "com.android.support:gridlayout-v7:" + Versions.support_library;
    String support_localbroadcast = "com.android.support:localbroadcastmanager:" + Versions.support_library;
    String support_palette_v7 = "com.android.support:palette-v7:$ANDROID_SUPPORT_LIB_VERSION";
    String support_recyclerview_v7 = "com.android.support:recyclerview-v7:" + Versions.support_library;
    String support_support_v4 = "com.android.support:support-v4:" + Versions.support_library;
    String support_support_v13 = "com.android.support:support-v13:" + Versions.support_library;

    String support_multidex_core = "com.android.support:multidex:" + Versions.multidex;
    String support_multidex_instrumentation = "com.android.support:multidex-instrumentation:" + Versions.multidex;

    String support_test_runner = "com.android.support.test:runner:" + Versions.support_test;
    String support_test_rules = "com.android.support.test:rules:" + Versions.support_test;
    String support_test_uiautomator = "com.android.support.test.uiautomator:uiautomator-v18:2.1.2";

    String support_test_espresso_core = "com.android.support.test.espresso:espresso-core:" + Versions.espresso;
    String support_test_espresso_web = "com.android.support.test.espresso:espresso-web:" + Versions.espresso;
    String support_test_espresso_intents = "com.android.support.test.espresso:espresso-intents:" + Versions.espresso;
    String support_test_espresso_contrib = "com.android.support.test.espresso:espresso-contrib:" + Versions.espresso;
    String support_test_espresso_okhttp_idling = "com.jakewharton.espresso:okhttp3-idling-resource:1.0.0";

    String switchboardProtobuf = "com.fitbit.switchboard:switchboard-protobuf:" + Versions.switchboard_protobuf;

    String testrail = "com.frostrocket.testrailsdk:testrailsdk:1.0.2";
    String test_joda_time = "joda-time:joda-time:2.9.6";

    String threetenabp_android = "com.jakewharton.threetenabp:threetenabp:" + Versions.three_ten_abp_android;
    String threetenabp_java = "org.threeten:threetenbp:" + Versions.three_ten_abp_java;

    String timber = "com.jakewharton.timber:timber:" + Versions.timber;

    String zxing_core = "com.google.zxing:core:3.1.0";
    String zxing_android_core = "com.google.zxing:android-core:3.1.0";
    String zxing_android_integration = "com.google.zxing:android-integration:3.1.0";

    String fitbitgatt = "com.fitbit.bluetooth.fbgatt:fitbitgatt:" + Versions.fbgatt;

    String checkstyle = "com.puppycrawl.tools:checkstyle:" + Versions.checkstyle;

    String truth_lib = "com.google.truth:truth:" + Versions.truth;

    String launch_darkly = "com.launchdarkly:launchdarkly-android-client:" + Versions.launch_darkly;
    String optimizely = "com.optimizely.ab:android-sdk:" + Versions.optimizely;
    String guava = "com.google.guava:guava:" + Versions.guava;
}