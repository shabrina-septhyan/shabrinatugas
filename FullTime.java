public class FullTime {
    public class FullTime {

        private String unit;
        private int anualsalary;
        
        public FullTime(String unit, int anualsalary) {
            this.unit = unit;
            this.anualsalary = anualsalary;
        }
        
        public String getUnit() {
            return unit;
        }
        
        public void setUnit(String unit) {
            this.unit = unit;
        }
        
        public int getAnualsalary() {
            return anualsalary;
        }
        
        public void setAnualsalary(int anualsalary) {
            this.anualsalary = anualsalary;
        }
        public void print() {
            System.out.println("Unit : " + unit);
            System.out.println("Anual salary : " + anualsalary);
        }
    
    }
}
