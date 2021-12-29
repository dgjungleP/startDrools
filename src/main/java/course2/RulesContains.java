package course2;

import entity.Person;
import entity.School;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class RulesContains {

    public static void main(String[] args) {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer container = kieServices.getKieClasspathContainer();
        KieSession session = container.newKieSession("containTest");
        Person person = new Person();
        School school = new School();
        person.setAge(30);
        person.setName("张三");
        person.setClassName("no1");
        school.setClassName("no1");
        session.insert(person);
        session.insert(school);
        int count = session.fireAllRules();
        System.out.println("Count: " + count);
        session.dispose();
    }

}
