package com.example.homea1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FirstFragment extends Fragment {

    private EditText editPassword;
    private Button buttonConfig;
    private final String isPassword = "Radin15ballow";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        
        editPassword = view.findViewById(R.id.et_password);
        buttonConfig = view.findViewById(R.id.btn_button);
        button();
    }
    public void button (){
        buttonConfig.setOnClickListener(view -> {

            String password = editPassword.getText().toString().trim();
            if (!password.equals(isPassword)){
                editPassword.setError("Неправильный пароль");
            } else {
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container,new RecyclerFragment())
                        .addToBackStack("FirstFragment")
                        .commit();
            }
        });
    }
}