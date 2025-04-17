package com.example.marvelapp.presentation.fragments.characters

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marvelapp.databinding.FragmentCharactersBinding
import com.leadmedia.core.domain.model.Character
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CharactersFragment : Fragment() {
    private var _binding: FragmentCharactersBinding? = null
    private val binding get() = _binding!!

    private val charactersAdapter: CharactersAdapter = CharactersAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCharactersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initCharactersAdapter()

        charactersAdapter.submitList(
            listOf(
                Character("Daniel", "https://i.pinimg.com/736x/a9/22/03/a92203e1949a17c1f561eb5f71f748e0.jpg"),
                Character("Daniel", "https://i.pinimg.com/736x/a9/22/03/a92203e1949a17c1f561eb5f71f748e0.jpg"),
                Character("Daniel", "https://i.pinimg.com/736x/a9/22/03/a92203e1949a17c1f561eb5f71f748e0.jpg"),
                Character("Daniel", "https://i.pinimg.com/736x/a9/22/03/a92203e1949a17c1f561eb5f71f748e0.jpg"),
                Character("Daniel", "https://i.pinimg.com/736x/a9/22/03/a92203e1949a17c1f561eb5f71f748e0.jpg"),
                Character("Daniel", "https://i.pinimg.com/736x/a9/22/03/a92203e1949a17c1f561eb5f71f748e0.jpg"),
                Character("Daniel", "https://i.pinimg.com/736x/a9/22/03/a92203e1949a17c1f561eb5f71f748e0.jpg"),
                Character("Daniel", "https://i.pinimg.com/736x/a9/22/03/a92203e1949a17c1f561eb5f71f748e0.jpg"),
                Character("Daniel", "https://i.pinimg.com/736x/a9/22/03/a92203e1949a17c1f561eb5f71f748e0.jpg"),
            )
        )
    }

    private fun initCharactersAdapter() {
        binding.recyclerCharacters.run {
            setHasFixedSize(true)
            adapter = charactersAdapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}