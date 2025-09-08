package krv.fit.bstu.basic_affirmations_cards.data

import krv.fit.bstu.basic_affirmations_cards.R
import krv.fit.bstu.basic_affirmations_cards.affirmations.Affirmation

class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmations_1, R.drawable.screenshot_1),
            Affirmation(R.string.affirmations_2, R.drawable.screenshot_2),
            Affirmation(R.string.affirmations_3, R.drawable.screenshot_3),
            Affirmation(R.string.affirmations_4, R.drawable.screenshot_4),
            Affirmation(R.string.affirmations_5, R.drawable.screenshot_5),
        )}
}