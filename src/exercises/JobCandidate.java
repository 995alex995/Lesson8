package exercises;

import java.util.ArrayList;
import java.util.Arrays;

/* 
 * 1. Make the JobCandidate class implement Comparable.  
 * 2. Add a JobCandadate instance that represents yourself, and use compareTo() to see who should be given the job.
 * 
 */

import java.util.List;

public class JobCandidate {

	private static String name;
	private List<String> personalityTraits;
	private int hoursSpentCoding;
	private String teacherName;
	private int salaryRequired;

	public JobCandidate(List<String> personalityTraits, int hoursSpentCoding, String teacherName, int salaryRequired) {
		super();
		this.personalityTraits = personalityTraits;
		this.hoursSpentCoding = hoursSpentCoding;
		this.teacherName = teacherName;
		this.salaryRequired = salaryRequired;
	}
	
	public static void main(String[] args) {
		JobCandidate june = new JobCandidate(Arrays.asList(new String[] {"adaptable", "scatty", "curious"}), 650, "Vinny Wade", 1200000); 
		JobCandidate alex = new JobCandidate(Arrays.asList(new String[] { "adaptable", "consistent", "friendly" }),130, "June Clark", 30000);

		if (june.compareTo(alex) == -1) {
			System.out.println("Alex will be accepted");
		} else if (june.compareTo(alex) == 1) {
			System.out.println("June will be accepted");
		} else {
			System.out.println("Boss will decide,since both are equal");
		}

	}
	public int compareTo(JobCandidate jc) {

		if (this.personalityTraits.size() > jc.personalityTraits.size()) {

			if (this.hoursSpentCoding > jc.hoursSpentCoding) {
				return -1;
			} else if (this.hoursSpentCoding < jc.hoursSpentCoding) {
				if (this.salaryRequired < jc.salaryRequired) {
					return -1;
				} else if (this.salaryRequired > jc.salaryRequired) {
					return 1;
				} else {
					return 0;
				}
			} else {
				if (this.salaryRequired < jc.salaryRequired) {
					return -1;
				} else if (this.salaryRequired > jc.salaryRequired) {
					return 0;
				} else {
					return -1;
				}
			}

		} else if (this.personalityTraits.size() < jc.personalityTraits.size()) {

			if (this.hoursSpentCoding > jc.hoursSpentCoding) {
				if (this.salaryRequired < jc.salaryRequired) {
					return -1;
				} else if (this.salaryRequired > jc.salaryRequired) {
					return 1;
				} else {
					return 0;
				}
			} else if (this.hoursSpentCoding < jc.hoursSpentCoding) {
				return 1;
			} else {
				if (this.salaryRequired < jc.salaryRequired) {
					return 0;
				} else if (this.salaryRequired > jc.salaryRequired) {
					return 1;
				} else {
					return 1;
				}
			}

		} else {

			if (this.hoursSpentCoding > jc.hoursSpentCoding) {
				if (this.salaryRequired < jc.salaryRequired) {
					return -1;
				} else if (this.salaryRequired > jc.salaryRequired) {
					return 0;
				} else {
					return -1;
				}
			} else if (this.hoursSpentCoding < jc.hoursSpentCoding) {
				if (this.salaryRequired < jc.salaryRequired) {
					return 0;
				} else if (this.salaryRequired > jc.salaryRequired) {
					return 1;
				} else {
					return 1;
				}
			} else {
				if (this.salaryRequired < jc.salaryRequired) {
					return -1;
				} else if (this.salaryRequired > jc.salaryRequired) {
					return 1;
				} else {
					return 0;
				}
			}

		}

	}

	
	
	}


