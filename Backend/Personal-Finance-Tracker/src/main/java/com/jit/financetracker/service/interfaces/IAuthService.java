package com.jit.financetracker.service.interfaces;

import com.jit.financetracker.dto.request.LoginRequestDto;
import com.jit.financetracker.dto.request.OtpVerifyRequestDto;
import com.jit.financetracker.dto.request.RegisterRequestDto;
import com.jit.financetracker.dto.response.JwtAuthResponseDto;

public interface IAuthService {

    public void register(RegisterRequestDto request);
    public void verifyOtp(OtpVerifyRequestDto request);
    public JwtAuthResponseDto login(LoginRequestDto request);

}
