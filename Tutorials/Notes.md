Chapter 6 
LAYOUTS 

- Relative Layouts means every ui element is related to each other 
- With linear layout, all the ui will be placed Line After Line 

# Relative Layout 


<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".MainActivity"
android:padding="2dp"
>

    <RadioGroup
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/checker"
        android:orientation="horizontal"
        android:id="@+id/rdGroup"
        >

        <RadioButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="10dp"
            android:layout_marginLeft="20dp"
            android:text="Single"
            android:id="@+id/rbSingle"
            android:checked="true"


            />
    <RadioButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        android:layout_marginLeft="20dp"
        android:text="Married"
        android:id="@+id/rbMarried"


        />



        <RadioButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="10dp"
            android:layout_marginLeft="20dp"
            android:text="In a Relationship"
            android:id="@+id/rbRel"


            />

    </RadioGroup>

<ProgressBar
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_below="@+id/rdGroup"
android:layout_centerInParent="true"
android:layout_marginTop="20dp"
android:id="@+id/progBar"
android:visibility="gone"


    />

    <ProgressBar
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@+id/rdGroup"
        android:layout_centerInParent="true"
        android:layout_marginTop="20dp"
        android:id="@+id/progBar2"
        android:visibility="VISIBLE"
        style="@style/Widget.AppCompat.ProgressBar.Horizontal"

        android:max="100"
        android:layout_marginLeft="20dp"
        android:layout_marginRight="20dp"


        />

</RelativeLayout>


# Linear Layout 
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".MainActivity"
android:orientation="horizontal"
>
<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Hello Text"
android:id="@+id/Hello"
android:background="@color/black"
android:layout_weight="20"
/>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Bingo Bar"
        android:id="@+id/Bingo"
        android:background="@color/red"

        android:layout_weight="80"
        />


</LinearLayout>


# Constraint Layout 
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:padding="2dp"
tools:context=".MainActivity">


    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="TextView"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.388"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.444" />

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView"
        app:layout_constraintVertical_bias="0.228" />

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="179dp"
        android:layout_height="98dp"
        app:layout_constraintEnd_toEndOf="@+id/button"
        app:layout_constraintStart_toStartOf="@+id/button"
        tools:layout_editor_absoluteY="675dp"
        tools:srcCompat="@tools:sample/backgrounds/scenic" />

</androidx.constraintlayout.widget.ConstraintLayout>
