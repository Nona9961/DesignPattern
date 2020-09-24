import com.nona.Application;
import com.nona.testinJ.Renbo;
import com.nona.testinJ.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )
@RunWith(SpringRunner.class)
public class SpringBoottest {

    @Autowired
    Student student = new Student();
//    @Autowired
//    Student xixi;
//    @Autowired
//    Renbo renbo;

    @Test
    public void doSSS() {
//        System.out.println((student == xixi));
//        System.out.println(student);
//        xixi.setName("任博");
//        System.out.println(renbo.getRenbo().getName());
    }
}
