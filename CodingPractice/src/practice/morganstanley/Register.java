package morganstanley;
interface Register{
 void addAttendance(int[] a);
 void changeAttendance(int id, char c);
 void reduceRegister(int l);
 int maxAttendance();
}