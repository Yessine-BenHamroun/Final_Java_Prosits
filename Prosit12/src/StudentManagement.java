import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

    public class StudentManagement implements Management {
        @Override
        public void displayStudents(List<Etudiant> students, Consumer<Etudiant> con) {
            for (Etudiant student : students) {
                con.accept(student);
            }
        }

        @Override
        public void displayStudentsByFilter(List<Etudiant> students, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
            for (Etudiant student : students) {
                if (pre.test(student)) {
                    con.accept(student);
                }
            }
        }

        @Override
        public String returnStudentsNames(List<Etudiant> students, Function<Etudiant, String> fun) {
            StringBuilder result = new StringBuilder();
            for (Etudiant student : students) {
                result.append(fun.apply(student)).append(" ");
            }
            return result.toString().trim();
        }

        @Override
        public Etudiant createStudent(Supplier<Etudiant> sup) {
            return sup.get();
        }

        @Override
        public List<Etudiant> sortStudentsById(List<Etudiant> students, Comparator<Etudiant> com) {
            students.sort(com);
            return students;
        }

        @Override
        public Stream<Etudiant> convertToStream(List<Etudiant> students) {
            return students.stream();
        }
    }


