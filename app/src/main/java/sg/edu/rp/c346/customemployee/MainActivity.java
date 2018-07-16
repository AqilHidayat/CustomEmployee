package sg.edu.rp.c346.customemployee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<EmployeeItem> alEmployeeList;
    CustomAdapter caEmployee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.lvCustomEmployee);

        alEmployeeList = new ArrayList<>();

        EmployeeItem Emp1 = new EmployeeItem("John", "Software Technical Leader", 3400);
        EmployeeItem Emp2 = new EmployeeItem("May", "Programmer", 2200);


        alEmployeeList.add(Emp1);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);
        alEmployeeList.add(Emp2);



        caEmployee = new CustomAdapter(this, R.layout.employee_item, alEmployeeList);

        lvEmployee.setAdapter(caEmployee);
    }
}
