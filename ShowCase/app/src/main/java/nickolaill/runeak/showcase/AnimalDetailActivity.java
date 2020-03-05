package nickolaill.runeak.showcase;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

public class AnimalDetailActivity extends AppCompatActivity {
    private Animal mAnimal;
    private TextView mAnimalTitle;
    private TextView mAnimalDescription;
    private TextView mAnimalBonus;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.content_animal_detail);
        mAnimal = getIntent().getParcelableExtra("animal");

        mAnimalTitle = findViewById(R.id.animal_detail_title);
        mAnimalDescription = findViewById(R.id.animal_detail_description);
        mAnimalBonus = findViewById(R.id.animal_detail_bonus);

        mAnimalTitle.setText(mAnimal.getName());
        mAnimalDescription.setText(mAnimal.getDescription());
        mAnimalBonus.setText(mAnimal.getBonusInfo());
    }
}
