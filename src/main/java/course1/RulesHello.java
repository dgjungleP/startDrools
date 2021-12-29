package course1;

import entity.Person;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class RulesHello {

    public static void main(String[] args) {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer container = kieServices.getKieClasspathContainer();
        KieSession session = container.newKieSession("testhelloworld");
        Person person = new Person();
        session.insert(person);
        int count = session.fireAllRules();
        session.dispose();
    }

}
