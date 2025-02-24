package com;

public class unit01 {
	public String jisuan(int x, int y){
		if (x>=80 && y>=60){
			if (x>=90 || y>=90) {
				return "a=[-]:";
			}else {
				return "a=2:";
			}
			
		}else {
			
			if (x<=70 || y<=70) {
				return "a=3:";
			}else {
				return "a=4:";
			}
		}
	}
}
