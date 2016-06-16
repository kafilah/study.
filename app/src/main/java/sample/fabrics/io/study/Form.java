package sample.fabrics.io.study;

/**
 * Created by earlybirdcamp on 6/15/16.
 */
public class Form {
        private String id;
        private String _location;
        private String _group;
        private String _productivity;
        private String _notes;

        public Form(String location, String group, String productivity, String notes){
            _location = location;
            _group = group;
            _productivity = productivity;
            _notes = notes;
        }

        public String getLocation() {
            return (_location);
        }

        public void setLocation(String location) {
            _location = location;
        }

        public String getGroup() {
            return (_group);
        }

        public void setGroup(String group) {
            _group = group;
        }

        public String getProductivity() {
            return (_productivity);
        }

        public void setProductivity(String productivity) {
            _productivity = productivity;
        }

        public String getNotes() {
            return (_notes);
        }

        public void setNotes(String notes) {
            _notes = notes;
        }

        public void showMe(){
            System.out.println(_location);
            System.out.println(_notes);
            System.out.println(_group);
            System.out.println(_productivity);
        }

}
