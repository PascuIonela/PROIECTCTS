

package obspattern;

public interface DepartmentSubject {
    public void addDepartmentListener(DepartmentListener dl);
    public void notifyDepartmentListeners();
}
