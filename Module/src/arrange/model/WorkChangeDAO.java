package arrange.model;

import java.util.List;

public interface WorkChangeDAO {
	void addWorkChange(WorkChange workChange);
	//Administrator getAdministrator(WorkChange workChange);
	//void updateWorkChange(WorkChange workChange);
	void deleteWorkChange(WorkChange workChange);
	List<WorkChange> getWorkChanges(WorkChange workChange);
}
