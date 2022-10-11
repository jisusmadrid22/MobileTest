// Generated by Dagger (https://dagger.dev).
package com.yzdev.mobiletest.di;

import com.yzdev.mobiletest.data.dataSource.RestDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataSourceModule_RestDataSourceFactory implements Factory<RestDataSource> {
  private final DataSourceModule module;

  private final Provider<Retrofit> retrofitProvider;

  public DataSourceModule_RestDataSourceFactory(DataSourceModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public RestDataSource get() {
    return restDataSource(module, retrofitProvider.get());
  }

  public static DataSourceModule_RestDataSourceFactory create(DataSourceModule module,
      Provider<Retrofit> retrofitProvider) {
    return new DataSourceModule_RestDataSourceFactory(module, retrofitProvider);
  }

  public static RestDataSource restDataSource(DataSourceModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.restDataSource(retrofit));
  }
}