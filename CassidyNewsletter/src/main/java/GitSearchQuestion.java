import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.io.CharStreams;
import org.kohsuke.github.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class GitSearchQuestion {

    //curl -H "authToken: $GIT_OAUTH" https://api.github.com/search/code?q=react+in:file+org:github
    //curl -H "authToken: $GIT_OAUTH" https://api.github.com/search/repositories?q=language:javascript


    public static void main(String[] args) throws IOException {

        GitHub github = new GitHubBuilder().withAppInstallationToken("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").build();

        Iterable<GHRepository> repoResults = github.searchRepositories().language("js").list();

        List<String> repos = Lists.newArrayList();
        for (GHRepository repository : repoResults) {
            repos.add(repository.getName());
        }

        List<String> reposContainingReactVersion = Lists.newArrayList();
        for (String repository : repos) {
            Iterable<GHContent> packageFiles = github.searchContent().repo(repository).path("package.json").q("react").list();
            for (GHContent packageFileContents : packageFiles) {
                String result = CharStreams.toString(new InputStreamReader(
                        packageFileContents.read(), Charsets.UTF_8));
                if (result.contains("17.0.2")) {
                    System.out.println(result);
                    reposContainingReactVersion.add(repository);
                }
            }
        }

        System.out.println("Result is: " + reposContainingReactVersion);
    }
}
