package arrange.model;

import java.util.List;

public interface WorkArrangeDAO {
	void addWorkArrange(WorkArrange workArrange);
	//Administrator getWorkArrange(WorkArrange workArrange);
	//void updateWorkArrange(WorkArrange workArrange);
	void deleteWorkArrange(WorkArrange workArrange);
	List<WorkArrange> getWorkArranges(WorkArrange workArrange);
}
