package miscellaneous;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentObject>{

	@Override
	public int compare(StudentObject o1, StudentObject o2) {
		if(o1.getMarksPhysics() + o1.getMarksMaths() + o1.getMarksChemistry() > o2.getMarksPhysics() + o2.getMarksMaths() + o2.getMarksChemistry()){
			return -1;
		}else if(o1.getMarksPhysics() + o1.getMarksMaths() + o1.getMarksChemistry() < o2.getMarksPhysics() + o2.getMarksMaths() + o2.getMarksChemistry()){
			return 1;
		}else{
			if(o1.getMarksPhysics() > o2.getMarksPhysics()){
				return -1;
			}	
			else{
				if(o1.getMarksPhysics() < o2.getMarksPhysics()){
					return 1;
				}
				else{
					if(o1.getMarksChemistry() > o2.getMarksChemistry()){
						return -1;
					}
					else{
						if(o1.getMarksChemistry() < o2.getMarksChemistry()){
							return 1;
						}
						else{
							if(o1.getMarksMaths() > o2.getMarksMaths()){
								return -1;
							}
							else{
								return 1;
							}
						}
					}
				}
			}
			
		}
	}
	
}
