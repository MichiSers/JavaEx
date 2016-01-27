package annotation;

import static annotation.Criticality.*;

/**
 * Created by Michi on 26.01.2016.
 */

@Review(reviewers = {"John Doe", "May Musterwoman"}, criticality = SEVERE)
public class SampleAnnotatedClass {

    @PublishOnline("http://othr.de/yajp/services/testresult")
    public double getTestResultByStudentId(String studentId){
        return 0.0;
    }

    @PublishOnline
    public String getHelpText(){
        return "helping text";
    }
}



