public class PartTime {
    public class PartTime {

        private int hoursworked;

        public PartTime(int hoursworked) {
            this.hoursworked = hoursworked;
        }

        public int getHoursworked() {
            return hoursworked;
        }

        public void setHoursworked(int hoursworked) {
            this.hoursworked = hoursworked;
        }
        public void print() {
            System.out.println("Hours Worked: " + hoursworked);
        }
    }
}
