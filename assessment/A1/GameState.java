import java.time.LocalDate;
import java.time.LocalDateTime;

sealed interface GameState permits Active, Cancelled, Draft, Finished {

  default   String describe() {
        switch (this) {
            case Active active -> {
                return "Игра в разгаре";
            }
            case Cancelled cancelled -> {
                return "Игра отменена";
            }
            case Draft draft -> {
                return "Мы ещё не начали";
            }
            case Finished finished -> {
                return "Игра окончена";
            }
        }
    }
}

record Draft(LocalDate plannedStart) implements  GameState { }

record Active(LocalDateTime startedAt, int participantsCount) implements GameState { }

record Finished(LocalDateTime endedAt, String summary) implements GameState { }

record Cancelled(String reason) implements GameState { }

