import java.util.Objects;

public class Park {



    public static class Attraction {
        private final String nameOfAttraction;
        private final String workingTime;
        private final int costOfAttraction;

        private Attraction(String nameOfAttraction, String workingTime, int costOfAttraction) {
            if (Objects.isNull(nameOfAttraction) || Objects.isNull(workingTime)) {
                throw new IllegalArgumentException("Name or working time required.");
            }
            if (costOfAttraction == 0) {
                throw new IllegalArgumentException("Price is required");
            }
            this.nameOfAttraction = nameOfAttraction;
            this.workingTime = workingTime;
            this.costOfAttraction = costOfAttraction;
        }

        public static Attraction of(String nameOfAttraction, String workingTime, int costOfAttraction) {
            return new Attraction(nameOfAttraction,workingTime,costOfAttraction);
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "nameOfAttraction='" + nameOfAttraction + '\'' +
                    ", workingTime='" + workingTime + '\'' +
                    ", costOfAttraction=" + costOfAttraction +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Attraction that = (Attraction) o;

            if (costOfAttraction != that.costOfAttraction) return false;
            if (!nameOfAttraction.equals(that.nameOfAttraction)) return false;
            return workingTime.equals(that.workingTime);
        }

        @Override
        public int hashCode() {
            int result = nameOfAttraction.hashCode();
            result = 31 * result + workingTime.hashCode();
            result = 31 * result + costOfAttraction;
            return result;
        }
    }
}
