package nickolaill.runeak.showcase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AnimalAdapter.ItemClickListener {
    AnimalAdapter mAdapter;
    ArrayList<Animal> mAnimals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Data
        mAnimals = new ArrayList<>();
        mAnimals.add(new Animal("Tiger", "Dangerous Kitty", "Grrr!"));
        mAnimals.add(new Animal("Lion", "King of the Jungle", "Rawrr!"));
        mAnimals.add(new Animal("Monkey", "Monkey see, monkey do", "Uhh uhh uh!"));

        // Recyclerview
        RecyclerView recyclerView = findViewById(R.id.main_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new AnimalAdapter(this, mAnimals);
        mAdapter.setClickListener(this);
        recyclerView.setAdapter(mAdapter);
    }


    @Override
    public void onItemClick(View view, int position) {
        Intent i = new Intent(MainActivity.this, AnimalDetailActivity.class);
        i.putExtra("animal", mAnimals.get(position));
        startActivity(i);
    }
}
