package messagingpatternanalyzer;

/**
 * Generic interface for filtering messages
 */
public interface MessageFilter<T> {
    boolean filter(T message);
}

