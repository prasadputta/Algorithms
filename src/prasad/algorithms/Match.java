package prasad.algorithms;

    import java.util.HashSet;
    import java.util.Set;

    public class Match {
        public boolean doTheyMatch(Person p1, Person p2) {

            //Are they equal?
            boolean equal =  p1.equals(p2);

            //If I add both to a Set does it enforce uniqueness? YES, because we have implemented equals and hashcode in the obj
            Set<Person> setPerson = new HashSet<Person>();
            setPerson.add(p1);
            setPerson.add(p2);

            //the set size here would be only one
            if(setPerson.size() == 1 && equal) return true;
            //If both conditions above are true, then return true, else false;
            return false;
        }

        public static void main(String[] args) {
            Match pr = new Match();
            byte age=44;
            short zip = 22;
            Person p1 = new Person("Prasad",age,"2814ehoneysuckle","chandler","AZ",zip);
            Person p3 = new Person("Prasad",age,"2814ehoneysuckle","chandler","AZ",zip);
            Person p2 = new Person("Christopher",age,"2814ehoneysuckle","chandler","AZ",zip);
            System.out.println("The result should be false --the actual result is here -->"+ pr.doTheyMatch(p1,p2));
            System.out.println("The result should be true --the actual result is here --> "+ pr.doTheyMatch(p1,p3));

        }

    }



