package martinhizkia.jwork;
/**
 * @author Martin Hizkia Parasi
 * @version 16 Juni 2021
 */
public enum InvoiceStatus {
    Ongoing {
        @Override
        public String toString(){
            return "Ongoing";
        }
    },
    Finished {
        @Override
        public String toString(){
            return "Finished";
        }
    },
    Cancelled {
        @Override
        public String toString(){
            return "Cancelled";
        }
    };
}
