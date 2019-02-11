import org.gradle.api.artifacts.dsl.RepositoryHandler;
import org.gradle.api.artifacts.repositories.MavenArtifactRepository;

@SuppressWarnings({"unused", "SpellCheckingInspection"})
public class Repos {

    /**
     * Returns Artifactory's jcenter cache if we are building in CI.  Otherwise returns the global jcenter.
     *
     * This difference is a optimization (CI can save bandwidth costs by using Artifactory, but Artifactory
     * can be very slow for engineers in our EU offices)
     */
    public static MavenArtifactRepository jcenter(RepositoryHandler handler) {
        MavenArtifactRepository repo;
        repo = handler.jcenter();
        return repo;
    }

    public static MavenArtifactRepository google(RepositoryHandler handler) {
        MavenArtifactRepository google = handler.google();
        return google;
    }
}
