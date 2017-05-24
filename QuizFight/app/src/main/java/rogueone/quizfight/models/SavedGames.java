package rogueone.quizfight.models;

import android.support.annotation.NonNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mdipirro on 23/05/17.
 */

public class SavedGames implements Serializable{
    private List<Duel> duels = new ArrayList<>();

    public List getDuels() {
        return duels;
    }

    public List getDuels(int n) {
        return duels.subList(0, n + 1);
    }

    public boolean isEmpty() {
        return duels.isEmpty();
    }
}
