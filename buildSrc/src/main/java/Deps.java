@SuppressWarnings({"unused", "SpellCheckingInspection"})
public interface Deps {

    String junit_core = "junit:junit:" + Versions.junit;
    String junit5_vintage = "org.junit.vintage:junit-vintage-engine:" + Versions.junit5;
    String junit5_api = "org.junit.jupiter:junit-jupiter-api:" + Versions.junit5;
    String junit5_engine = "org.junit.jupiter:junit-jupiter-engine:" + Versions.junit5;
    String junit5_params = "org.junit.jupiter:junit-jupiter-params:" + Versions.junit5;
}