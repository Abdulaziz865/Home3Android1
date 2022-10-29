package com.example.homea1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerFragment extends Fragment {

    private final ListOfNameAdapter adapter = new ListOfNameAdapter();
    private final List<String> listOfName = new ArrayList<>();
    private RecyclerView rvListOfName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_recycle, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvListOfName = view.findViewById(R.id.rv_list_of_name);
        listOfName.add("Абдулазиз");
        listOfName.add("Умар");
        listOfName.add("Жайыл");
        listOfName.add("Азиз байке");
        listOfName.add("Арстанбек байке");
        listOfName.add("Нурсултан");
        listOfName.add("Нурмухаммед");
        listOfName.add("Фарух");
        listOfName.add("Адиль");
        listOfName.add("Эрлан байке");
        listOfName.add("Майк");
        listOfName.add("Чедвик");
        listOfName.add("Тони");
        listOfName.add("Харли");
        listOfName.add("Данил");
        listOfName.add("Сухраб");
        listOfName.add("Конор");
        listOfName.add("Хабиб");
        initialize();
        adapter.setData(listOfName);
    }

    private void initialize() {
        rvListOfName.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        rvListOfName.setAdapter(adapter);
    }
}