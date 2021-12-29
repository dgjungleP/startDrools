package cource3;

import entity.Person;
import entity.School;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class RulesMemberOf {

    public static void main(String[] args) {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer container = kieServices.getKieClasspathContainer();
        KieSession session = container.newKieSession("memberOfTest");
        Person person = new Person();
        School school = new School();
        person.setAge(30);
        person.setName("张三");
        person.setClassName("no1");
        school.setClassNameArray(new String[]{"no1", "no2", "no3", "no4"});
        school.setClassName("no1");
        session.insert(person);
        session.insert(school);
        int count = session.fireAllRules();
        System.out.println("Count: " + count);
        session.dispose();
    }

}
