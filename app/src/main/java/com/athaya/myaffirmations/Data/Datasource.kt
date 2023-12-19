package com.athaya.myaffirmations.Data

import com.athaya.myaffirmations.R
import com.athaya.myaffirmations.model.Affirmations

class Datasource() {
    fun loadAffirmation(): List<Affirmations> {
        return listOf<Affirmations>(
            Affirmations(R.string.Affirmation1, R.drawable.candi_borobudur),
            Affirmations(R.string.Affirmation2, R.drawable.danau_toba),
            Affirmations(R.string.Affirmation3, R.drawable.gunung_bromo),
            Affirmations(R.string.Affirmation4, R.drawable.kawah_ijen),
            Affirmations(R.string.Affirmation5, R.drawable.kepulauan_raja_ampat),
            Affirmations(R.string.Affirmation6, R.drawable.labuan_bajo),
            Affirmations(R.string.Affirmation7, R.drawable.ngarai_sianok),
            Affirmations(R.string.Affirmation8, R.drawable.nusa_penida),
            Affirmations(R.string.Affirmation9, R.drawable.terasering_tegallalang),
            Affirmations(R.string.Affirmation10, R.drawable.wae_rebo)
        )
    }
}