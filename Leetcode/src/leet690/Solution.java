package leet690;

import java.util.*;

public class Solution {
    /*
    *   员工类
    * */
    static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    public int getImportance(List<Employee> employees, int id) {
        // Map 存储所有的员工信息
        // Key -> 员工id
        // Value -> 员工对象
        Map<Integer,Employee> employeeMap = new HashMap<>();

        // 将所有的员工存入map中
        for (Employee employee : employees) {
            employeeMap.put(employee.id,employee);
        }

        // 要求员工的对象
        Employee retEmp = employeeMap.get(id);
        int ret = 0;


        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(id);
        while (!queue.isEmpty()) {
            int curId = queue.poll();
            Employee employee = employeeMap.get(curId);
            ret += employee.importance;
            List<Integer> subordinates = employee.subordinates;
            for (int subId : subordinates) {
                queue.offer(subId);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        List<Employee> list = new LinkedList<>();
        Employee employee = new Employee();
        employee.id = 1;
        employee.importance = 5;
        LinkedList<Integer> subordinates = new LinkedList<>();
        subordinates.add(2);
        subordinates.add(3);
        subordinates.add(4);


        employee.subordinates = subordinates;

        list.add(employee);


        employee = new Employee();
        employee.id = 2;
        employee.importance = 3;
        subordinates = new LinkedList<>();
        employee.subordinates = subordinates;
        list.add(employee);

        employee = new Employee();
        employee.id = 3;
        employee.importance = 4;
        subordinates = new LinkedList<>();
        employee.subordinates = subordinates;
        list.add(employee);

        employee = new Employee();
        employee.id = 4;
        employee.importance = 1;
        subordinates = new LinkedList<>();
        employee.subordinates = subordinates;
        list.add(employee);

        System.out.println(s.getImportance(list, 1));
    }
}
