package cn.studybigdata.hadoop.mapred.serialize;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class DeptReduce extends Reducer<IntWritable, Employee, IntWritable, IntWritable> {
    @Override
    protected void reduce(IntWritable dept, Iterable<Employee> employees, Context context) throws IOException, InterruptedException {

        int total = 0;

        for (Employee employee : employees) {
            int salary = employee.getSalary();
            total = total+salary;
        }
    
        context.write(dept, new IntWritable(total));
//        context.write(dept, NullWritable.get());

    }
}
