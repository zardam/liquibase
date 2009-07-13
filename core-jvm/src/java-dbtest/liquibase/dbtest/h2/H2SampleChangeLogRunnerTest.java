package liquibase.dbtest.h2;

import liquibase.dbtest.AbstractSimpleChangeLogRunnerTest;
import liquibase.util.plugin.ClassPathScanner;
import liquibase.test.TestContext;
import liquibase.resource.CompositeResourceAccessor;
import liquibase.resource.ClassLoaderResourceAccessor;

import java.io.File;
import java.net.URLClassLoader;
import java.net.URL;

@SuppressWarnings({"JUnitTestCaseWithNoTests"})
public class H2SampleChangeLogRunnerTest extends AbstractSimpleChangeLogRunnerTest {

    public H2SampleChangeLogRunnerTest() throws Exception {
        super("h2", "jdbc:h2:mem:liquibase");
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Override
    public void testExecuteExtChangelog() throws Exception {
        super.testExecuteExtChangelog();    //To change body of overridden methods use File | Settings | File Templates.
    }
}