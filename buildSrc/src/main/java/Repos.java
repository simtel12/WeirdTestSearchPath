import org.gradle.api.artifacts.dsl.RepositoryHandler;
import org.gradle.api.artifacts.repositories.MavenArtifactRepository;
import org.gradle.api.artifacts.repositories.RepositoryContentDescriptor;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unused", "SpellCheckingInspection"})
public class Repos {

    private static final Set<String> googleGroups = new HashSet<String>() {
        {
            add("com\\.android\\.support.*");
            add("com\\.android\\.tools.*");
            add("com\\.android\\.databinding");
            add("android\\.arch\\..*");
            add("androidx\\..*");
            add("com\\.google\\.android\\.gms");
            add("com\\.google\\.firebase");
            add("com\\.crashlytics\\.sdk\\.android");
            add("io\\.fabric\\.sdk\\.android");
        }
    };

    private static final Set<String> jitpackGroups = new HashSet<String>() {
        {
            add("com\\.github\\.trevjonez\\.composer-gradle-plugin");
            add("com\\.github\\.mtotschnig");
            add("com\\.github\\.jbfitbit");
            add("com\\.github\\.nwaldispuehl");
        }
    };

    private static final Set<String> fitbitGroups = new HashSet<String>() {
        {
            add("com\\.fitbit\\..*");
        }
    };

    private static final Set<String> fabricGroups = new HashSet<String>() {
        {
            add("io\\.fabric\\.tools");
            add("com\\.crashlytics\\.sdk\\.android");
        }
    };

    /**
     * Returns Artifactory's jcenter cache if we are building in CI.  Otherwise returns the global jcenter.
     *
     * This difference is a optimization (CI can save bandwidth costs by using Artifactory, but Artifactory
     * can be very slow for engineers in our EU offices)
     */
    public static MavenArtifactRepository jcenter(RepositoryHandler handler) {
        MavenArtifactRepository repo;
        repo = handler.jcenter();
        repo.content(repositoryContentDescriptor -> {
            excludeGroup(repositoryContentDescriptor, fabricGroups);
            excludeGroup(repositoryContentDescriptor, fitbitGroups);
            excludeGroup(repositoryContentDescriptor, jitpackGroups);
            excludeGroup(repositoryContentDescriptor, googleGroups);
        });
        return repo;
    }

    public static MavenArtifactRepository google(RepositoryHandler handler) {
        MavenArtifactRepository google = handler.google();
        google.content(repositoryContentDescriptor -> {
            includeGroup(repositoryContentDescriptor, googleGroups);
        });
        return google;
    }

    private static void includeGroup(RepositoryContentDescriptor repositoryContentDescriptor, Set<String> groups) {
        for (String group : groups) {
            repositoryContentDescriptor.includeGroupByRegex(group);
        }
    }

    private static void excludeGroup(RepositoryContentDescriptor repositoryContentDescriptor, Set<String> groups) {
        for (String group : groups) {
            repositoryContentDescriptor.excludeGroupByRegex(group);
        }
    }
}
