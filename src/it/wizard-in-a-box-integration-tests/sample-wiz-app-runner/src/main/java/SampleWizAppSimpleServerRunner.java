import be.fluid_it.tools.dropwizard.box.it.app.HelloWorldApplication;
import be.fluid_it.tools.dropwizard.box.it.support.WizRunner;

public class SampleWizAppSimpleServerRunner {
    public static void main(String[] args) throws Exception {
        new WizRunner(new HelloWorldApplication(), "sample-wiz-app-runner", "hello-world-as-dw-jar-simple-server.yml").run();
    }
}
