/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer,Employee> map = new HashMap();
        for(Employee emp:employees)
        {
            map.put(emp.id,emp);
        }
        Queue<Employee> queue = new LinkedList();
        int sum=0;
        queue.add(map.get(id));
        while(!queue.isEmpty())
        {
            Employee emp = queue.poll();
            sum+=emp.importance;
            Iterator<Integer> i = emp.subordinates.iterator();
            while(i.hasNext())
            {
                queue.add(map.get(i.next()));
            }
        }
        return sum;
    }
}