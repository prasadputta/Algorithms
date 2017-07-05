package practice.test;

    import java.util.HashSet;
    import java.util.Set;

    public class Problem4_Match {
        public boolean doTheyMatch(Problem4_Person p1, Problem4_Person p2) {

            //Are they equal?
            boolean equal =  p1.equals(p2);

            //If I add both to a Set does it enforce uniqueness? YES, because we have implemented equals and hashcode in the obj
            Set<Problem4_Person> setPerson = new HashSet<Problem4_Person>();
            setPerson.add(p1);
            setPerson.add(p2);

            //the set size here would be only one
            if(setPerson.size() == 1 && equal) return true;
            //If both conditions above are true, then return true, else false;
            return false;
        }

        public static void main(String[] args) {
            Problem4_Match pr = new Problem4_Match();
            byte age=44;
            short zip = 22;
            Problem4_Person p1 = new Problem4_Person("Prasad",age,"2814ehoneysuckle","chandler","AZ",zip);
            Problem4_Person p3 = new Problem4_Person("Prasad",age,"2814ehoneysuckle","chandler","AZ",zip);
            Problem4_Person p2 = new Problem4_Person("Christopher",age,"2814ehoneysuckle","chandler","AZ",zip);
            System.out.println("The result should be false --the actual result is here -->"+ pr.doTheyMatch(p1,p2));
            System.out.println("The result should be true --the actual result is here --> "+ pr.doTheyMatch(p1,p3));

        }

    }



