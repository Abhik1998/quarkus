package io.quarkus.deployment.pkg;

import java.util.List;

import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigRoot;

@ConfigRoot
public class PackageConfig {

    public static final String JAR = "jar";
    public static final String NATIVE = "native";

    /**
     * The requested output type.
     * 
     * The default built in types are jar and native
     */
    @ConfigItem(defaultValue = JAR)
    public String type;

    /**
     * If the java runner should be packed as an uberjar
     */
    @ConfigItem(defaultValue = "false")
    public boolean uberJar;

    /**
     * Manifest configuration of the runner jar.
     */
    @ConfigItem
    public ManifestConfig manifest;

    /**
     * The entry point of the application. In most cases this should not be modified.
     */
    @ConfigItem(defaultValue = "io.quarkus.runner.GeneratedMain")
    public String mainClass;

    /**
     * Files that should not be copied to the output artifact
     */
    @ConfigItem
    public List<String> userConfiguredIgnoredEntries;

    /**
     * The suffix that is applied to the runner jar and native images
     */
    @ConfigItem(defaultValue = "-runner")
    public String runnerSuffix;
}
