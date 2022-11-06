// Generated by view binder compiler. Do not edit!
package kkn.vishu.mathana.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import kkn.vishu.mathana.R;
import kkn.vishu.mathana.utils.ZoomImageView;

public final class FragmentSingleImageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LottieAnimationView animationView;

  @NonNull
  public final ZoomImageView ivImage;

  private FragmentSingleImageBinding(@NonNull ConstraintLayout rootView,
      @NonNull LottieAnimationView animationView, @NonNull ZoomImageView ivImage) {
    this.rootView = rootView;
    this.animationView = animationView;
    this.ivImage = ivImage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSingleImageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSingleImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_single_image, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSingleImageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.animationView;
      LottieAnimationView animationView = rootView.findViewById(id);
      if (animationView == null) {
        break missingId;
      }

      id = R.id.ivImage;
      ZoomImageView ivImage = rootView.findViewById(id);
      if (ivImage == null) {
        break missingId;
      }

      return new FragmentSingleImageBinding((ConstraintLayout) rootView, animationView, ivImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}