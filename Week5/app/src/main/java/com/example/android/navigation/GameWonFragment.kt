/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.navigation

import android.content.ActivityNotFoundException
import android.content.Intent
import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.core.app.ShareCompat
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentGameWonBinding
import android.content.pm.ResolveInfo
import android.content.pm.PackageManager



class GameWonFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentGameWonBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_game_won, container, false)
        // todo (17) сделать так, чтобы при нажатии на nextMatchButton мы бы перешли на GameFragment

        // todo (18) поставить true у setHasOptionsMenu
        return binding.root
    }

    // todo (19)написать метод getShareIntent, который вернет share intent с
    // todo текстом R.string.share_success_text и аргументами numCorrect и NumQuestions

    // todo (20) написать метод shareSuccess(), который запустит активити с аргументом getShareIntent

    // todo (21) переписать onCreateOptionsMenu, в котором мы будем инфлейтить меню и проверять, находимся
    // todo мы на экране активити или нет, и если нет, то прятать значки меню

    // todo (22) переписать onOptionsItemSelected, который будет проверять все item.itemId, и если он равен R.id.share,
    // todo то вызывать метод shareSuccess()
}
